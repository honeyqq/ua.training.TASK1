package view;

import model.entities.cars.Car;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.TreeSet;

/**
 * Created 30.11.2019
 *
 * @author Max
 */

public class View {

    static String BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(BUNDLE_NAME,
                    new Locale("en"));
    //new Locale("ua"));

    public void printCarsFromDiapason(String message) {
        System.out.println(bundle.getString(message));
    }

    public void printMyParking(TreeSet<Car> myParking) {
        System.out.println(myParking);
    }

    public void printPriceOfAllCars(int priceOfAllCars) {
        System.out.println(bundle.getString(TextConstants.AUTOPARK_COSTS) + priceOfAllCars + " " +
                bundle.getString(TextConstants.DOLLARS));
    }

    public void printCarsFromDiapason(ArrayList<String> diapasonOfSpeed) {
        System.out.println(diapasonOfSpeed);
    }
}
