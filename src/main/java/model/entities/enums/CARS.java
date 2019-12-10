package model.entities.enums;

public enum CARS {

    AUDI_S6("AUDI S6", 7.6, 235, 73900),
    AUDI_A3("AUDI A3", 6.5, 250, 32500),
    BMW_X6("BMW X6", 9.7, 304, 78300),
    BMW_X7("BMW X7", 10.6, 209, 92500),
    FORD_MUSTANG("FORD MUSTANG", 9.5, 262, 35095),
    FORD_FOCUS("FORD FOCUS", 8.5, 265, 19000),
    MERCEDES_BENZ_AMG_GT("MERCEDES-BENZ AMG GT", 12.5, 319, 115900),
    MERCEDES_BENZ_CLA_250("MERCEDES-BENZ CLA 250", 10.3, 242, 33100),
    PORSCHE_CAYENNE("PORSCHE CAYENEE", 8.2, 286, 65700),
    PORSCHE_PANAMERA("PORSCHE PANAMERA", 6.9, 242, 86300);

    private String name;
    private double fuelConsumption;
    private int maxSpeed;
    private int price;

    CARS(String name, double fuelConsumption, int maxSpeed, int price) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

}
