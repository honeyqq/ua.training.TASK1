package controller;

import model.Autopark;
import model.entities.cars.*;
import model.entities.enums.CARS;
import view.TextConstants;
import view.View;

/**
 * Created 30.11.2019
 *
 * @author Max
 */

public class Controller {
    private View view;
    private Autopark autopark = new Autopark();

    public Controller(View view) {
        this.view = view;
    }

    public void execute() {

        BmwCar bmwX6 = new BmwCar(CARS.BMW_X6.getName(), CARS.BMW_X6.getFuelConsumption(),
                CARS.BMW_X6.getMaxSpeed(), CARS.BMW_X6.getPrice());

        BmwCar bmwX7 = new BmwCar(CARS.BMW_X7.getName(), CARS.BMW_X7.getFuelConsumption(),
                CARS.BMW_X7.getMaxSpeed(), CARS.BMW_X7.getPrice());

        AudiCar audiS6 = new AudiCar(CARS.AUDI_S6.getName(), CARS.AUDI_S6.getFuelConsumption(),
                CARS.AUDI_S6.getMaxSpeed(), CARS.AUDI_S6.getPrice());

        AudiCar audiA3 = new AudiCar(CARS.AUDI_A3.getName(), CARS.AUDI_A3.getFuelConsumption(),
                CARS.AUDI_A3.getMaxSpeed(), CARS.AUDI_A3.getPrice());

        FordCar fordMustang = new FordCar(CARS.FORD_MUSTANG.getName(), CARS.FORD_MUSTANG.getFuelConsumption(),
                CARS.FORD_MUSTANG.getMaxSpeed(), CARS.FORD_MUSTANG.getPrice());

        FordCar fordFocus = new FordCar(CARS.FORD_FOCUS.getName(), CARS.FORD_FOCUS.getFuelConsumption(),
                CARS.FORD_FOCUS.getMaxSpeed(), CARS.FORD_FOCUS.getPrice());

        MercedesCar mercedesAmgGt = new MercedesCar(CARS.MERCEDES_BENZ_AMG_GT.getName(),
                CARS.MERCEDES_BENZ_AMG_GT.getFuelConsumption(), CARS.MERCEDES_BENZ_AMG_GT.getMaxSpeed(),
                CARS.MERCEDES_BENZ_AMG_GT.getPrice());

        MercedesCar mercedesCla250 = new MercedesCar(CARS.MERCEDES_BENZ_CLA_250.getName(),
                CARS.MERCEDES_BENZ_CLA_250.getFuelConsumption(),
                CARS.MERCEDES_BENZ_CLA_250.getMaxSpeed(), CARS.MERCEDES_BENZ_CLA_250.getPrice());

        PorscheCar porscheCayenee = new PorscheCar(CARS.PORSCHE_CAYENNE.getName(),
                CARS.PORSCHE_CAYENNE.getFuelConsumption(), CARS.PORSCHE_CAYENNE.getMaxSpeed(),
                CARS.PORSCHE_CAYENNE.getPrice());

        PorscheCar porschePanamera = new PorscheCar(CARS.PORSCHE_PANAMERA.getName(),
                CARS.PORSCHE_PANAMERA.getFuelConsumption(), CARS.PORSCHE_PANAMERA.getMaxSpeed(),
                CARS.PORSCHE_PANAMERA.getPrice());

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

        view.printMyParking(autopark.getAutopark());
        view.printPriceOfAllCars(autopark.sumOfAllAutoPark());

        view.printCarsFromDiapason(TextConstants.CARS_FROM_DIAPASON);

        view.printCarsFromDiapason(autopark.searchByDiapasonOfSpeed(250, 300));
    }
}
