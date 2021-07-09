package models;

public class Bread {

    private String name = "";
    private String flavor = "";
    private String aroma = "";
    private String flourType = "";
    private Double weight = 0.00;
    private Double price = 0.00;

    public Bread() {
    }

    public Bread(String name, String flavor, String aroma, String flourType, Double weight, Double price) {
        this.name = name;
        this.flavor = flavor;
        this.aroma = aroma;
        this.flourType = flourType;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getFlourType() {
        return flourType;
    }

    public void setFlourType(String flourType) {
        this.flourType = flourType;
    }
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
