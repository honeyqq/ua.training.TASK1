package view;

import model.entities.Car;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.TreeSet;

/**
 * Created 30.11.2019
 *
 * @author Max Katrenko
 */

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //new Locale("ua");
                    new Locale("en"));

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMyParking(TreeSet<Car> myParking) {
        System.out.println(myParking);
    }

    public void printPriceOfAllCars(int priceOfAllCars) {
        System.out.println("Autopark costs: " + priceOfAllCars + " dollars");
    }

    public void printFlexibleString(String message) {
        printMessage(bundle.getString(message));
    }

}
