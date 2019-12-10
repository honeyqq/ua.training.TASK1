package model.entities.cars;


public class AudiCar extends Car {

    public AudiCar(String name, double fuelConsumption, int maxSpeed, int price) {
        super(name, fuelConsumption, maxSpeed, price);
    }

    @Override
    public String toString() {
        return getName() + ", fuelConsumption= " + getFuelConsumption() + ", maxSpeed=" + getMaxSpeed() +
                ", price=" + getPrice() + " dollars" + "\n";
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
}
