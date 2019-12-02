package controller;

import model.entities.Autopark;
import model.entities.Car;
import model.entities.Cars;
import model.Model;
import view.View;

/**
 * Created 30.11.2019
 *
 * @author Max Katrenko
 */

public class Controller {
    private Model model;
    private View view;
    private Autopark autopark = new Autopark();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {

        View view = new View();

        Car BMW = new Car(Cars.BMW_325i.getName(), Cars.BMW_325i.getFuelCapacity(),
                Cars.BMW_325i.getSecondsToHundreds(), Cars.BMW_325i.getPrice());

        Car NISSAN = new Car(Cars.NISSAN_MURANO.getName(), Cars.NISSAN_MURANO.getFuelCapacity(),
                Cars.NISSAN_MURANO.getSecondsToHundreds(), Cars.NISSAN_MURANO.getPrice());

        Car Mercedes = new Car(Cars.MERCEDES_BENZ_C250_W204.getName(), Cars.MERCEDES_BENZ_C250_W204.getFuelCapacity(),
                Cars.MERCEDES_BENZ_C250_W204.getSecondsToHundreds(), Cars.MERCEDES_BENZ_C250_W204.getPrice());

        Car VOLVO = new Car(Cars.VOLVO_S60_T4.getName(), Cars.VOLVO_S60_T4.getFuelCapacity(),
                Cars.VOLVO_S60_T4.getSecondsToHundreds(), Cars.VOLVO_S60_T4.getPrice());

        Car AUDI = new Car(Cars.AUDI_S6.getName(), Cars.AUDI_S6.getFuelCapacity(),
                Cars.AUDI_S6.getSecondsToHundreds(), Cars.AUDI_S6.getPrice());

        Car FORD = new Car(Cars.FORD_EXPLORER_SPORT.getName(), Cars.FORD_EXPLORER_SPORT.getFuelCapacity(),
                Cars.FORD_EXPLORER_SPORT.getSecondsToHundreds(), Cars.FORD_EXPLORER_SPORT.getPrice());

        Car TOYOTA = new Car(Cars.TOYOTA_HIGHLANDER.getName(), Cars.TOYOTA_HIGHLANDER.getFuelCapacity(),
                Cars.TOYOTA_HIGHLANDER.getSecondsToHundreds(), Cars.TOYOTA_HIGHLANDER.getPrice());

        Car MAZDA = new Car(Cars.MAZDA_CX7.getName(), Cars.MAZDA_CX7.getFuelCapacity(),
                Cars.MAZDA_CX7.getSecondsToHundreds(), Cars.MAZDA_CX7.getPrice());

        Car PEUGEOT = new Car(Cars.PEUGEOT_308_THP.getName(), Cars.PEUGEOT_308_THP.getFuelCapacity(),
                Cars.PEUGEOT_308_THP.getSecondsToHundreds(), Cars.PEUGEOT_308_THP.getPrice());

        Car INFINITI = new Car(Cars.INFINITI_G37S.getName(), Cars.INFINITI_G37S.getFuelCapacity(),
                Cars.INFINITI_G37S.getSecondsToHundreds(), Cars.INFINITI_G37S.getPrice());

        autopark.addToMyParking(BMW);
        autopark.addToMyParking(NISSAN);
        autopark.addToMyParking(Mercedes);
        autopark.addToMyParking(VOLVO);
        autopark.addToMyParking(AUDI);
        autopark.addToMyParking(FORD);
        autopark.addToMyParking(TOYOTA);
        autopark.addToMyParking(MAZDA);
        autopark.addToMyParking(PEUGEOT);
        autopark.addToMyParking(INFINITI);

        view.printMyParking(autopark.getMyAutopark());
        view.printPriceOfAllCars(Cars.priceOfAllCars());
    }
}
