package am.javaprogram.classes.productlist;

import am.javaprogram.classes.productlist.models.Product;

import java.util.Random;

public class ProductGenerator {
    private final String[] NAMES_PRODUCTS = {
            "Tigran", "Vardan", "Ashot", "Vahram", "Valod", "Gurgen", "Ishxan", "Varazdat", "Gevorg"
    };

    private final String[] NAMES_AUTHOR = {
            "Hovhannes Tumanyan", "Hovhannes Shiraz", "Raffi"
    };

    public ProductGenerator() { }

    public Product generateProduct() {
        Product generate =
                new Product(

                );
        return generate;
    }

    private int getRangeByMinMax(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
