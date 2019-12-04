import model.entities.autopark.Autopark;
import model.entities.enums.BMW;
import model.entities.enums.PORSCHE;
import model.entities.factories.BmwFactory;
import model.entities.factories.PorscheFactory;
import org.junit.*;

import static org.junit.Assert.*;

public class Tests {

    private Autopark autopark = new Autopark();

    @Before
    public void setUP() {
        BmwFactory bmwX6 = new BmwFactory(BMW.BMW_X6.getName(), BMW.BMW_X6.getFuelConsumption(),
                BMW.BMW_X6.getMaxSpeed(), BMW.BMW_X6.getPrice());

        PorscheFactory porsche = new PorscheFactory(PORSCHE.PORSCHE_CAYENNE.getName(),
                PORSCHE.PORSCHE_CAYENNE.getFuelConsumption(), PORSCHE.PORSCHE_CAYENNE.getMaxSpeed(),
                PORSCHE.PORSCHE_CAYENNE.getPrice());

        autopark.addToAutopark(bmwX6);
        autopark.addToAutopark(porsche);
    }

    @Test
    public void searchByDiapasonOfSpeed(){
        int expected = PORSCHE.PORSCHE_CAYENNE.getPrice() + BMW.BMW_X6.getPrice();
        int actual = autopark.sumOfAllAutoPark();
        assertEquals(expected,actual);
    }
}
