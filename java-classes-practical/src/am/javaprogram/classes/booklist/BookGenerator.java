package am.javaprogram.classes.booklist;

import am.javaprogram.classes.booklist.models.House;

import java.util.Random;

public class BookGenerator {
    private final String[] NAMES_PUBLISHER = {
            "Tigran", "Vardan", "Ashot", "Vahram", "Valod", "Gurgen", "Ishxan", "Varazdat", "Gevorg"
    };
    private final String[] NAMES_AUTHOR = {
            "Hovhannes Tumanyan", "Hovhannes Shiraz", "Raffi"
    };

    public BookGenerator() {

    }

    public House generateBook() {
        House generate =
                new House(
                        NAMES_AUTHOR[getRangeByMinMax(0, NAMES_AUTHOR.length - 1)],
                        NAMES_PUBLISHER[getRangeByMinMax(0, NAMES_PUBLISHER.length - 1)],
                        getRangeByMinMax(1994, 2000) + "-02-13");
        return generate;
    }

    private int getRangeByMinMax(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
