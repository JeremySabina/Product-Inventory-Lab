package services;


import models.Coffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeServicesTest {

    @Test
    public void createTest(){


        String expectedName = "Crazy Columbian";
        String expectedBrand = "Joe's Joe";
        String expectedFlavor = "Dark Roast";
        String expectedAroma = "Chocolatey";
        Integer expectedWeightInPounds = 5;
        Integer expectedCoffeeGrindAmount = 4;
        Double expectedPrice = 21.99;


        CoffeeServices CoffeeServices = new CoffeeServices();
        Coffee testCoffee = CoffeeServices.create(expectedName, expectedFlavor,
                expectedAroma, expectedBrand, expectedWeightInPounds, expectedCoffeeGrindAmount, expectedPrice);


        int actualId = testCoffee.getId();
        String actualName = testCoffee.getName();
        String actualFlavor = testCoffee.getFlavor();
        String actualBrand = testCoffee.getBrand();
        String actualAroma = testCoffee.getAroma();
        Integer actualWeightInPounds = testCoffee.getWeightInPounds();
        Double actualPrice = testCoffee.getPrice();
        Integer actualCoffeeGrindAmount = testCoffee.getCoffeeGrindAmount();



        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedFlavor, actualFlavor);
        Assertions.assertEquals(expectedAroma, actualAroma);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedWeightInPounds, actualWeightInPounds);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedCoffeeGrindAmount, actualCoffeeGrindAmount);

    }

    @Test
    public void findCoffeeTest() {

    }
}
