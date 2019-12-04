package controller;

import model.Model;
import model.entities.autopark.Autopark;
import model.entities.enums.*;
import model.entities.factories.*;
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

//        Car BMW = new Car(Cars.BMW_325i.getName(), Cars.BMW_325i.getFuelCapacity(),
//                Cars.BMW_325i.getSecondsToHundreds(), Cars.BMW_325i.getPrice());
//
//        Car NISSAN = new Car(Cars.NISSAN_MURANO.getName(), Cars.NISSAN_MURANO.getFuelCapacity(),
//                Cars.NISSAN_MURANO.getSecondsToHundreds(), Cars.NISSAN_MURANO.getPrice());
//
//        Car Mercedes = new Car(Cars.MERCEDES_BENZ_C250_W204.getName(), Cars.MERCEDES_BENZ_C250_W204.getFuelCapacity(),
//                Cars.MERCEDES_BENZ_C250_W204.getSecondsToHundreds(), Cars.MERCEDES_BENZ_C250_W204.getPrice());
//
//        Car VOLVO = new Car(Cars.VOLVO_S60_T4.getName(), Cars.VOLVO_S60_T4.getFuelCapacity(),
//                Cars.VOLVO_S60_T4.getSecondsToHundreds(), Cars.VOLVO_S60_T4.getPrice());
//
//        Car AUDI = new Car(Cars.AUDI_S6.getName(), Cars.AUDI_S6.getFuelCapacity(),
//                Cars.AUDI_S6.getSecondsToHundreds(), Cars.AUDI_S6.getPrice());
//
//        Car FORD = new Car(Cars.FORD_EXPLORER_SPORT.getName(), Cars.FORD_EXPLORER_SPORT.getFuelCapacity(),
//                Cars.FORD_EXPLORER_SPORT.getSecondsToHundreds(), Cars.FORD_EXPLORER_SPORT.getPrice());
//
//        Car TOYOTA = new Car(Cars.TOYOTA_HIGHLANDER.getName(), Cars.TOYOTA_HIGHLANDER.getFuelCapacity(),
//                Cars.TOYOTA_HIGHLANDER.getSecondsToHundreds(), Cars.TOYOTA_HIGHLANDER.getPrice());
//
//        Car MAZDA = new Car(Cars.MAZDA_CX7.getName(), Cars.MAZDA_CX7.getFuelCapacity(),
//                Cars.MAZDA_CX7.getSecondsToHundreds(), Cars.MAZDA_CX7.getPrice());
//
//        Car PEUGEOT = new Car(Cars.PEUGEOT_308_THP.getName(), Cars.PEUGEOT_308_THP.getFuelCapacity(),
//                Cars.PEUGEOT_308_THP.getSecondsToHundreds(), Cars.PEUGEOT_308_THP.getPrice());
//
//        Car INFINITI = new Car(Cars.INFINITI_G37S.getName(), Cars.INFINITI_G37S.getFuelCapacity(),
//                Cars.INFINITI_G37S.getSecondsToHundreds(), Cars.INFINITI_G37S.getPrice());
//
//        autopark.addToMyParking(BMW);
//        autopark.addToMyParking(NISSAN);
//        autopark.addToMyParking(Mercedes);
//        autopark.addToMyParking(VOLVO);
//        autopark.addToMyParking(AUDI);
//        autopark.addToMyParking(FORD);
//        autopark.addToMyParking(TOYOTA);
//        autopark.addToMyParking(MAZDA);
//        autopark.addToMyParking(PEUGEOT);
//        autopark.addToMyParking(INFINITI);
//
//        view.printMyParking(autopark.getMyAutopark());
//        view.printPriceOfAllCars(Cars.priceOfAllCars());

        BmwFactory bmwX6 = new BmwFactory(BMW.BMW_X6.getName(), BMW.BMW_X6.getFuelConsumption(),
                BMW.BMW_X6.getMaxSpeed(), BMW.BMW_X6.getPrice());

        BmwFactory bmwX7 = new BmwFactory(BMW.BMW_X7.getName(), BMW.BMW_X7.getFuelConsumption(),
                BMW.BMW_X7.getMaxSpeed(), BMW.BMW_X7.getPrice());

        AudiFactory audiS6 = new AudiFactory(AUDI.AUDI_S6.getName(), AUDI.AUDI_S6.getFuelConsumption(),
                AUDI.AUDI_S6.getMaxSpeed(), AUDI.AUDI_S6.getPrice());

        AudiFactory audiA3 = new AudiFactory(AUDI.AUDI_A3.getName(), AUDI.AUDI_A3.getFuelConsumption(),
                AUDI.AUDI_A3.getMaxSpeed(), AUDI.AUDI_A3.getPrice());

        FordFactory fordMustang = new FordFactory(FORD.FORD_MUSTANG.getName(), FORD.FORD_MUSTANG.getFuelConsumption(),
                FORD.FORD_MUSTANG.getMaxSpeed(), FORD.FORD_MUSTANG.getPrice());

        FordFactory fordFocus = new FordFactory(FORD.FORD_FOCUS.getName(), FORD.FORD_FOCUS.getFuelConsumption(),
                FORD.FORD_FOCUS.getMaxSpeed(), FORD.FORD_FOCUS.getPrice());

        MercedesFactory mercedesAmgGt = new MercedesFactory(MERCEDES.MERCEDES_BENZ_AMG_GT.getName(),
                MERCEDES.MERCEDES_BENZ_AMG_GT.getFuelConsumption(), MERCEDES.MERCEDES_BENZ_AMG_GT.getMaxSpeed(),
                MERCEDES.MERCEDES_BENZ_AMG_GT.getPrice());

        MercedesFactory mercedesCla250 = new MercedesFactory(MERCEDES.MERCEDES_BENZ_CLA_250.getName(),
                MERCEDES.MERCEDES_BENZ_CLA_250.getFuelConsumption(),
                MERCEDES.MERCEDES_BENZ_CLA_250.getMaxSpeed(), MERCEDES.MERCEDES_BENZ_CLA_250.getPrice());

        PorscheFactory porscheCayenee = new PorscheFactory(PORSCHE.PORSCHE_CAYENNE.getName(),
                PORSCHE.PORSCHE_CAYENNE.getFuelConsumption(), PORSCHE.PORSCHE_CAYENNE.getMaxSpeed(),
                PORSCHE.PORSCHE_CAYENNE.getPrice());

        PorscheFactory porschePanamera = new PorscheFactory(PORSCHE.PORSCHE_PANAMERA.getName(),
                PORSCHE.PORSCHE_PANAMERA.getFuelConsumption(), PORSCHE.PORSCHE_PANAMERA.getMaxSpeed(),
                PORSCHE.PORSCHE_PANAMERA.getPrice());

        autopark.addToAutopark(bmwX6);
        autopark.addToAutopark(bmwX7);
        autopark.addToAutopark(audiS6);
        autopark.addToAutopark(audiA3);
        autopark.addToAutopark(fordFocus);
        autopark.addToAutopark(fordMustang);
        autopark.addToAutopark(mercedesAmgGt);
        autopark.addToAutopark(mercedesCla250);
        autopark.addToAutopark(porscheCayenee);
        autopark.addToAutopark(porschePanamera);

        view.printMyParking(autopark.showAutopark());
        view.printPriceOfAllCars(autopark.sumOfAllAutoPark());
    }
}
