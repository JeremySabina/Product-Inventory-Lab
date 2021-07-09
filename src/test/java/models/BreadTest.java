package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.BreadServices;

public class BreadTest {
    @Test
    public void constructorTest() {
        String expectedName = "Wheat Bread";
        String expectedFlavor = "Earthy";
        String expectedAroma = "Rich";
        String expectedFlourType = "Wheat";
        Double expectedWeight = 12.00;
        Double expectedPrice = 80.00;


        Bread testBread = new Bread(expectedName, expectedFlavor,
                expectedAroma, expectedFlourType, expectedWeight, expectedPrice);


        Assertions.assertEquals(expectedName, testBread.getName());

    }

    @Test

    public void setNameTest() {
        //given
        Bread bread = new Bread();
        String expected = "Rye";
        //when
        bread.setName(expected);
        String actual = bread.getName();


        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setFlavorTest() {
        //given
        Bread bread = new Bread();
        String expected = "Earthy";
        //when
        bread.setFlavor(expected);
        String actual = bread.getFlavor();


        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setAromaTest() {
        //given
        Bread bread = new Bread();
        String expected = "Pungent";

        //when
        bread.setAroma(expected);
        String actual = bread.getAroma();


        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setFlourTypeTest() {
        //given
        Bread bread = new Bread();
        String expected = "Wheat";

        //when
        bread.setFlourType(expected);
        String actual = bread.getFlourType();


        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setQuantityTest() {
        //given
        Bread bread = new Bread();
        Integer expected = 0;

        //when
        bread.setQuantity(expected);
        Integer actual = bread.getQuantity();


        //then
        Assertions.assertEquals(expected,actual);
    }


    @Test

    public void setWeightTest() {
        //given
        Bread bread = new Bread();
        Double expected = 0.00;

        //when
        bread.setWeight(expected);
        Double actual = bread.getWeight();


        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void setPriceTest() {
        //given
        Bread bread = new Bread();
        Double expected = 0.00;

        //when
        bread.setPrice(expected);
        Double actual = bread.getPrice();


        //then
        Assertions.assertEquals(expected,actual);
    }

}

