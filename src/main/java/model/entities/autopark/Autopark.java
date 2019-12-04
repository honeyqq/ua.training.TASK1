package model.entities.autopark;

import model.entities.Car;
import model.entities.Drivable;

import java.util.Iterator;
import java.util.TreeSet;

public class Autopark {
    private TreeSet<Drivable> autoPark = new TreeSet<>();

    public void addToAutopark(Drivable drivable) {
        autoPark.add(drivable);
    }

    public TreeSet<Drivable> showAutopark() {
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
}