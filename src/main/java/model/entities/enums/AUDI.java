package model.entities.enums;

public enum AUDI {

    AUDI_S6 ("AUDI S6",7.6,235,73900),
    AUDI_A3 ("AUDI A3",6.5,250,32500);

    private String name;
    private double fuelConsumption;
    private int maxSpeed;
    private int price;

    private AUDI(String name, double fuelConsumption, int maxSpeed, int price) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
