package am.javaprogram.classes.productlist.models;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private int price;
    private LocalDate guarantyDate;
    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    public Product() { }

    public Product( String name, int price, LocalDate guarantyDate) {
        this.id = noOfObjects;
        this.name = name;
        this.price = price;
        this.guarantyDate = guarantyDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getGuarantyDate() {
        return guarantyDate;
    }

    public void setGuarantyDate(LocalDate guarantyDate) {
        this.guarantyDate = guarantyDate;
    }
}
