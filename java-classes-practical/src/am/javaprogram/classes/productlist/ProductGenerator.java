package am.javaprogram.classes.productlist;

import am.javaprogram.classes.productlist.models.Product;

import java.util.Random;

public class ProductGenerator {
    private final String[] NAMES_PRODUCTS = {
            "Hard drink", "Economic", "sweets", "bread"
    };

    private final int[][] PRICE_PRODUCTS = {
            {1000,2000,3000,4000,5000},
            {100,200,300,400,500},
            {1100,2200,3300,4400,5500},
            {110,220,330,440,550},
    };

    public ProductGenerator() { }

    public Product generateProduct() {
        int index = getRangeByMinMax(0,NAMES_PRODUCTS.length);
        Product generate =
                new Product(
                    NAMES_PRODUCTS[index],
                    PRICE_PRODUCTS[index][getRangeByMinMax(0,NAMES_PRODUCTS.length)],
                    getRangeByMinMax(2020,2022)+"-11-25"
                );
        return generate;
    }

    private int getRangeByMinMax(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
