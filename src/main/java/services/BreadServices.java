package services;

import models.Bread;
import models.Coffee;

import java.util.ArrayList;
import java.util.List;

public class BreadServices {

    private static int nextId = 1;
    List<Bread> inventory = new ArrayList<>();

    public Bread create(String name, String flavor, String aroma,
                               String flourType, Double weight, Double price) {



            Bread createdBread = new Bread(nextId++, name, flavor, aroma,
                    flourType, weight, price);

            inventory.add(createdBread);

                    return createdBread;
    }

    public Bread findCoffee(int nextId) {
        return inventory.get(nextId);
    }

    public Bread[] findAll() {
        return inventory.toArray(new Bread[0]);
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
