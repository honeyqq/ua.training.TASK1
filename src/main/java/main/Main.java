package main;

import controller.Controller;
import view.View;

/**
 * Created 30.11.2019
 *
 * @author Max
 */

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.execute();
    }
}
