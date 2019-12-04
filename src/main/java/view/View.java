package view;

import model.entities.Drivable;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.TreeSet;

/**
 * Created 30.11.2019
 *
 * @author Max Katrenko
 */

public class View {

    static String BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(BUNDLE_NAME,
                    new Locale("en"));
                    //new Locale("ua"));

    public void printMessage(String message) {
        bundle.getString(message);
    }

    public void printMyParking(TreeSet<Drivable> myParking) {
        System.out.println(myParking);
    }

    public void printPriceOfAllCars(int priceOfAllCars) {
        System.out.println(bundle.getString(TextConstants.AUTOPARK_COSTS) + priceOfAllCars + " " +
                bundle.getString(TextConstants.DOLLARS));
    }

    public void printMessage(ArrayList<String> searchByDiapasonOfSpeed) {
        System.out.println(searchByDiapasonOfSpeed);
    }
}
