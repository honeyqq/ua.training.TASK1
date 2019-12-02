package view;

import model.entities.Car;

import java.util.TreeSet;

/**
 * Created 30.11.2019
 *
 * @author Max Katrenko
 */

public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMyParking(TreeSet<Car> myParking) {
        System.out.println(myParking);
    }

    public void printPriceOfAllCars(int priceOfAllCars) {
        System.out.println("Autopark costs: " + priceOfAllCars + " dollars");
    }
}
