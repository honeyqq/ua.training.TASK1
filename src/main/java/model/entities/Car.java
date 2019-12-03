package model.entities;

public abstract class Car implements Drivable{
    private String name;
    private double fuelCapacity;
    private double secondToHundreds;
    private int price;

    public Car(String name, double fuelCapacity, double secondToHundreds, int price) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.secondToHundreds = secondToHundreds;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getSecondToHundreds() {
        return secondToHundreds;
    }

    public void setSecondToHundreds(double secondToHundreds) {
        this.secondToHundreds = secondToHundreds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
