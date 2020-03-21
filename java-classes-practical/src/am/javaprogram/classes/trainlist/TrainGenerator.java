package am.javaprogram.classes.trainlist;

import am.javaprogram.classes.trainlist.models.Train;

import java.util.Random;

public class TrainGenerator {
    private final String[] DESTINATIONS = {"Yerevan", "Gyumri", "Sevan"};
    private final String[] DEPARTURE_TIMES = {"08:05", "11:00", "14:15", "18:30"};

    public TrainGenerator() {
    }

    public Train generateBook() {
        Train generate =
                new Train(
                        DESTINATIONS[getRangeByMinMax(0, DESTINATIONS.length)],
                        getRangeByMinMax(100, 999),
                        getRangeByMinMax(1, 10),
                        DEPARTURE_TIMES[getRangeByMinMax(0, DEPARTURE_TIMES.length)]
                );
        return generate;
    }

    private int getRangeByMinMax(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
