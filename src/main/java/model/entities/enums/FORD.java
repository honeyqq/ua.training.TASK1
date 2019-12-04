package model.entities.enums;


public enum FORD {
    FORD_MUSTANG ("FORD MUSTANG",9.5,262,35095),
    FORD_FOCUS ("FORD FOCUS",8.5,265,19000);

    private String name;
    private double fuelConsumption;
    private int maxSpeed;
    private int price;

    private FORD(String name, double fuelConsumption, int maxSpeed, int price) {
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
