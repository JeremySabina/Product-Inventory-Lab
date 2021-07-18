package services;

import models.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeServices {

    List<Coffee> inventory = new ArrayList<>();
    private static int nextId = 1;

    public Coffee create(String name, String flavor, String aroma, String brand,
                         Integer weightInPounds, Integer coffeeGrindAmount, Double price) {


        Coffee createdCoffee = new Coffee(nextId++, name, brand, flavor, aroma,
                weightInPounds, coffeeGrindAmount, price);

        inventory.add(createdCoffee);

        return createdCoffee;

    }

    public Coffee findCoffee(int nextId) {
        return inventory.get(nextId);
    }

    public Coffee[] findAll() {
        return inventory.toArray(new Coffee[0]);
    }

    public boolean  delete(int nextId) {
        for (int i = 0; i < inventory.size(); i++) {
            if(i == nextId) {
                inventory.remove(i);
            }
        }
        return false;
    }

}
