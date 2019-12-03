package model.entities.factories;

import model.entities.Car;

public class BmwFactory extends Car implements Comparable {

    public BmwFactory(String name, double fuelCapacity, double secondToHundreds, int price) {
        super(name, fuelCapacity, secondToHundreds, price);
    }


    @Override
    public void drive() {
        System.out.println(getName() + " is driving");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
