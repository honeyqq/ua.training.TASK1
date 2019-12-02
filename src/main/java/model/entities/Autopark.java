package model.entities;

import java.util.TreeSet;

/**
 * Created 01.12.2019
 *
 * @author Max Katrenko
 */
public class Autopark {
    private TreeSet<Car> myParking = new TreeSet<Car>();

    public void addToMyParking(Car car) {
        myParking.add(car);
    }

    public TreeSet<Car> getMyParking() {
        return myParking;
    }
}
