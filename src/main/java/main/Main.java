package main;

import controller.Controller;
import model.Model;
import view.View;

/**
 * Created 30.11.2019
 *
 * @author Max Katrenko
 */

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.execute();
    }
}
