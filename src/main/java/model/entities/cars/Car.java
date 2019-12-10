package model.entities.cars;


public abstract class Car implements Comparable<Car> {
    private String name;
    private double fuelConsumption;
    private int maxSpeed;
    private int price;

    public Car(String name, double fuelConsumption, int maxSpeed, int price) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
