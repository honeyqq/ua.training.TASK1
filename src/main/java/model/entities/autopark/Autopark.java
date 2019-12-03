package model.entities.autopark;

import model.entities.Drivable;

import java.util.TreeSet;

public class Autopark {
    private TreeSet<Drivable> autopark = new TreeSet<>();

    public void addToAutopark(Drivable car) {
        autopark.add(car);
    }

    public TreeSet<Drivable> showAutopark() {
        return autopark;
    }

}
