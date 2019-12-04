package model.entities.factories;

import model.entities.Car;
import model.entities.Drivable;

public class FordFactory extends Car implements Drivable {

    public FordFactory(String name, double fuelConsumption, int maxSpeed, int price) {
        super(name, fuelConsumption, maxSpeed, price);

    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving");
    }

    @Override
    public int compareTo(Car car) {
        if (car.getFuelConsumption() > this.getFuelConsumption()) {
            return 1;
        } else if (car.getFuelConsumption() < this.getFuelConsumption()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return getName() + ", fuelConsumption= " + getFuelConsumption() + ", maxSpeed=" + getMaxSpeed() +
                ", price=" + getPrice() + " dollars" + "\n";
    }
}
