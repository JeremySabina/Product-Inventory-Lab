package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeTest {


    @Test

    public void setFlavorTest() {
        //given
        Coffee coffee = new Coffee();
        String expected = "Earthy";

        //when
        coffee.setFlavor(expected);
        String actual = coffee.getFlavor();


        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setNameTest() {
        //given
        Coffee coffee = new Coffee();
        String expected = "Pike Place";

        //when
        coffee.setName(expected);
        String actual = coffee.getName();

        //then
        Assertions.assertEquals(expected,actual);
    }


    @Test

    public void setBrandTest() {
        //given
        Coffee coffee = new Coffee();
        String expected = "Starbucks";

        //when
        coffee.setBrand(expected);
        String actual = coffee.getBrand();

        //then
        Assertions.assertEquals(expected,actual);
    }


    @Test

    public void setAromaTest() {
        //given
        Coffee coffee = new Coffee();
        String expected = "Smokey";

        //when
        coffee.setAroma(expected);
        String actual = coffee.getAroma();

        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setWeightInPoundsTest() {
        //given
        Coffee coffee = new Coffee();
        Integer expected = 10;

        //when
        coffee.setWeightInPounds(expected);
        Integer actual = coffee.getWeightInPounds();

        //then
        Assertions.assertEquals(expected,actual);
    }


    @Test

    public void setLiquidInOuncesAmountTest() {
        //given
        Coffee coffee = new Coffee();
        Integer expected = 12;

        //when
        coffee.setLiquidInOuncesAmount(expected);
        Integer actual = coffee.getLiquidInOuncesAmount();

        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setCoffeeGrindAmountTest() {
        //given
        Coffee coffee = new Coffee();
        Integer expected = 6;

        //when
        coffee.setCoffeeGrindAmount(expected);
        Integer actual = coffee.getCoffeeGrindAmount();

        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setPriceTest() {
        //given
        Coffee coffee = new Coffee();
        Double expected = 5.67;

        //when
        coffee.setPrice(expected);
        Double actual = coffee.getPrice();

        //then
        Assertions.assertEquals(expected,actual);
    }

}
