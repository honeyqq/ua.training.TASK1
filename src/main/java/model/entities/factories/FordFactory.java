package model.entities.factories;

import model.entities.Car;
import model.entities.Drivable;

public class FordFactory extends Car implements Comparable {

    public FordFactory(String name, double fuelCapacity, double secondToHundreds, int price) {
        super(name, fuelCapacity, secondToHundreds, price);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving");
    }
}
