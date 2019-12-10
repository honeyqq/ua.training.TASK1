import model.Autopark;
import model.entities.cars.BmwCar;
import model.entities.cars.PorscheCar;
import model.entities.enums.CARS;
import org.junit.*;

import static org.junit.Assert.*;

public class Tests {

    private Autopark autopark = new Autopark();

    @Before
    public void setUP() {
        BmwCar bmwX6 = new BmwCar(CARS.BMW_X6.getName(), CARS.BMW_X6.getFuelConsumption(),
                CARS.BMW_X6.getMaxSpeed(), CARS.BMW_X6.getPrice());

        PorscheCar porsche = new PorscheCar(CARS.PORSCHE_CAYENNE.getName(),
                CARS.PORSCHE_CAYENNE.getFuelConsumption(), CARS.PORSCHE_CAYENNE.getMaxSpeed(),
                CARS.PORSCHE_CAYENNE.getPrice());

        autopark.addToAutopark(bmwX6);
        autopark.addToAutopark(porsche);
    }

    @Test
    public void testSumOfAllAutoPark(){
        int expected = CARS.PORSCHE_CAYENNE.getPrice() + CARS.BMW_X6.getPrice();
        int actual = autopark.sumOfAllAutoPark();
        assertEquals(expected,actual);
    }
}
