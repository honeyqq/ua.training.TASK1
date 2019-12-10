package model;

import model.entities.cars.Car;

import java.util.ArrayList;
import java.util.TreeSet;

public class Autopark {
    private TreeSet<Car> autoPark = new TreeSet<>();

    public void addToAutopark(Car car) {
        autoPark.add(car);
    }

    public int sumOfAllAutoPark() {
        int a = 0;
        for (Car car : autoPark) {
            a += car.getPrice();
        }
        return a;
    }

    public ArrayList<String> searchByDiapasonOfSpeed(int minDiapason, int maxDiapason) {
        ArrayList<String> listOfCars = new ArrayList<>();
        for (Car car : getAutopark()) {
            if ((car.getMaxSpeed() <= maxDiapason) && (car.getMaxSpeed() >= minDiapason)) {
                listOfCars.add(car.getName());
            }
        }
        return listOfCars;
    }

    public TreeSet<Car> getAutopark() {
        return autoPark;
    }
}
