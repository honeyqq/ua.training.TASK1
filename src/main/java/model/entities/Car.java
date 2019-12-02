package model.entities;

public class Car extends Vehicle implements Comparable<Car> {

    public Car(String name, double fuelCapacity, double secondToHundreds, int price) {
        super(name, fuelCapacity, secondToHundreds, price);
    }

    @Override
    public String toString() {
        return "Name=" + getName() + ", Fuel capacity=" + getFuelCapacity() +
                ", Seconds to hundreds=" + getSecondToHundreds() + ", Price=" + getPrice() + "\n";
    }

    @Override
    public int compareTo(Car c) {
        if (c.getFuelCapacity() > this.getFuelCapacity()) {
            return -1;
        } else if (c.getFuelCapacity() < this.getFuelCapacity()) {
            return 1;
        }
        return 0;
    }
}
