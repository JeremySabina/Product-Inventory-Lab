package models;

public class Coffee {

    private String name = "";
    private String brand = "";
    private String flavor = "";
    private String aroma = "";
    private Integer weightInPounds = 0;
    private Integer liquidInOuncesAmount = 0;
    private Integer coffeeGrindAmount = 0;
    private Double price = 0.00;


    public Coffee(String name, String brand, String flavor,
                  String aroma, Integer weightInPounds,
                  Integer liquidInOuncesAmount,
                  Integer coffeeGrindAmount, Double price)
    {
        this.name = name;
        this.brand = brand;
        this.flavor = flavor;
        this.aroma = aroma;
        this.weightInPounds = weightInPounds;
        this.liquidInOuncesAmount = liquidInOuncesAmount;
        this.coffeeGrindAmount = coffeeGrindAmount;
        this.price = price;
    }

    public Coffee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public Integer getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(Integer weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Integer getLiquidInOuncesAmount() {
        return liquidInOuncesAmount;
    }

    public void setLiquidInOuncesAmount(Integer liquidInOuncesAmount) {
        this.liquidInOuncesAmount = liquidInOuncesAmount;
    }

    public Integer getCoffeeGrindAmount() {
        return coffeeGrindAmount;
    }

    public void setCoffeeGrindAmount(Integer coffeeGrindAmount) {
        this.coffeeGrindAmount = coffeeGrindAmount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
