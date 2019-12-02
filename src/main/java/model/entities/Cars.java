package model.entities;

/**
 * Created 30.11.2019
 *
 * @author Max Katrenko
 */

public enum Cars {
    BMW_325i("BMW_325i", 7.7, 7.5, 41750),
    AUDI_S6("AUDI_S6", 8.0, 4.8, 73900),
    FORD_EXPLORER_SPORT("FORD_EXPLORER_SPORT", 14.0, 6.4, 36675),
    INFINITI_G37S("INFINITI_G37S", 12.0, 5.9, 18900),
    NISSAN_MURANO("NISSAN_MURANO", 10.3, 8.0, 39230),
    MERCEDES_BENZ_C250_W204("MERCEDES_BENZ_C250_W204", 9.25, 7.2, 41400),
    VOLVO_S60_T4("VOLVO_S60_T4", 9.0, 8.5, 39400),
    PEUGEOT_308_THP("PEUGEOT_308_THP", 5.85, 9.1, 29890),
    MAZDA_CX7("MAZDA_CX7", 11.1, 8.3, 33990),
    TOYOTA_HIGHLANDER("TOYOTA_HIGHLANDER", 11.0, 8.2, 32375);

    private final String name;
    private final double fuelCapacity;
    private final double secondsToHundreds;
    private final int price;

    Cars(String name, double capacity, double secondsToHundreds, int price) {
        this.name = name;
        this.fuelCapacity = capacity;
        this.secondsToHundreds = secondsToHundreds;
        this.price = price;
    }

    public static int priceOfAllCars() {
        int allPrice = 0;
        Cars[] enumMassive = Cars.values();
        for (Cars cars : enumMassive) {
            allPrice += cars.getPrice();
        }
        return allPrice;
    }

    public String getName() {
        return name;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getSecondsToHundreds() {
        return secondsToHundreds;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " fuelCapacity = " + fuelCapacity + " secondsToHundreds " + secondsToHundreds + "\n";
    }

}
