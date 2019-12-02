package model.entities;

import java.util.TreeSet;

/**
 * Created 01.12.2019
 *
 * @author Max Katrenko
 */

public class Autopark {
    private TreeSet<Car> myAutopark = new TreeSet<Car>();

    public void addToMyParking(Car car) {
        myAutopark.add(car);
    }

    public TreeSet<Car> getMyAutopark() {
        return myAutopark;
    }
}
