package services;

import models.Bread;

import java.util.ArrayList;

public class BreadServices {
    private static int nextId = 1;
    private ArrayList<Bread> inventory = new ArrayList<>();

    public static Bread create(String name, String flavor, String aroma,
                               String flourType, Double weight, Double price) {
            Bread createdBread = new Bread(nextId++, name, flavor, aroma,
                    flourType, weight, price);

        inventory.add(createdBread);

                    return createdBread;
    }
}
