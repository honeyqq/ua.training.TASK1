package model.entities.enums;

public enum MERCEDES {

    MERCEDES_BENZ_AMG_GT ("MERCEDES-BENZ AMG GT",12.5,319,115900),
    MERCEDES_BENZ_CLA_250 ("MERCEDES-BENZ CLA 250",10.3,242,33100);

    private String name;
    private double fuelConsumption;
    private int maxSpeed;
    private int price;

    private MERCEDES(String name, double fuelConsumption, int maxSpeed, int price) {
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
