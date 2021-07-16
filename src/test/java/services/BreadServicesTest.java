package services;

import models.Bread;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BreadServicesTest {
    @Test
    public void createTest(){

        Integer expectedId = 012345;
        String expectedName = "Wheat Bread";
        String expectedFlavor = "Earthy";
        String expectedAroma = "Rich";
        String expectedFlourType = "Wheat";
        Double expectedWeight = 12.00;
        Double expectedPrice = 80.00;


        BreadServices breadServices = new BreadServices();
        Bread testBread = BreadServices.create(expectedName, expectedFlavor,
                expectedAroma, expectedFlourType, expectedWeight, expectedPrice);


        int actualId = testBread.getId();
        String actualName = testBread.getName();
        String actualFlavor = testBread.getFlavor();
        String actualAroma = testBread.getAroma();
        String actualFlourType = testBread.getFlourType();
        Double actualWeight = testBread.getWeight();
        Double actualPrice = testBread.getPrice();


        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedFlavor, actualFlavor);
        Assertions.assertEquals(expectedAroma, actualAroma);
        Assertions.assertEquals(expectedFlourType, actualFlourType);
        Assertions.assertEquals(expectedWeight, actualWeight);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }
}