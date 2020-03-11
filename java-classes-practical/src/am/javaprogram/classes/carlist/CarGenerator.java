package am.javaprogram.classes.carlist;

import am.javaprogram.classes.carlist.models.Car;

import java.util.Random;

public class CarGenerator {
    private final String[] BRANDS = {
            "Mercedes", "BMW", "Toyota", "Lexus",
    };

    private final String[][] BRANDS_MODEL = {
            {"A-class", "CLA", "CLS"},
            {"X1", "X3", "X5"},
            {"Avalon", "Camry", "Corolla"},
            {"LS", "SC", "RC"}
    };

    public CarGenerator() {

    }

    public Car generateCar() {
        int index = getRangeByMinMax(0, BRANDS.length);
        Car generate = new Car(
                BRANDS[index],
                BRANDS_MODEL[index][getRangeByMinMax(0, 2)],
                getRangeByMinMax(1994, 2000) + "-02-13",
                getRangeByMinMax(1,9),
                getRangeByMinMax(10000,100000)
                );
        return generate;
    }

    private int getRangeByMinMax(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
