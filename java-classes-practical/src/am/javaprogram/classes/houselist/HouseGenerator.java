package am.javaprogram.classes.houselist;

import am.javaprogram.classes.houselist.models.House;

import java.util.Random;

public class HouseGenerator {

    private final String[] SQUARE = {
            "Square1", "Square2", "Square3"
    };

    public HouseGenerator() { }

    public House generateHouse() {
        House generate =
                new House(getRangeByMinMax(1,12),
                          SQUARE[getRangeByMinMax(0,SQUARE.length)],
                          getRangeByMinMax(1,6));
        return generate;
    }

    private int getRangeByMinMax(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
