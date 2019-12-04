package model.entities.autopark;

import model.entities.Car;
import model.entities.Drivable;

import java.util.ArrayList;
import java.util.TreeSet;

public class Autopark {
    private TreeSet<Drivable> autoPark = new TreeSet<>();

    public void addToAutopark(Drivable drivable) {
        autoPark.add(drivable);
    }

    public TreeSet<Drivable> getAutopark() {
        return autoPark;
    }

    public int sumOfAllAutoPark() {
        int a=0;
        for (Drivable drivable : autoPark) {
            Car car = (Car) drivable;
            a += car.getPrice();
        }
        return a;
    }

    public ArrayList<String> searchByDiapasonOfSpeed(int minDiapason, int maxDiapason) {
        ArrayList<String> listOfCars = new ArrayList<>();
        for (Drivable drivable : getAutopark()){
            Car car = (Car) drivable;
            if ((car.getMaxSpeed() <= maxDiapason) && (car.getMaxSpeed() >= minDiapason)){
                listOfCars.add(car.getName());
            }
        }
        return listOfCars;
    }
}
