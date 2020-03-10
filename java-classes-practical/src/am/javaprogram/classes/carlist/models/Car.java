package am.javaprogram.classes.carlist.models;

import java.time.LocalDate;

public class Car {
    private int id;
    private String brand;
    private String model;
    private LocalDate yearOfIssue;
    private int operatedYear;
    private int price;
    static  int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    public Car() {
    }

    public Car ( String brand, String model, String yearOfIssue, int operatedYear, int price) {
        this.id = noOfObjects;
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = LocalDate.parse(yearOfIssue);
        this.operatedYear = operatedYear;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOperatedYear() {
        return operatedYear;
    }

    public void setOperatedYear(int operatedYear) {
        this.operatedYear = operatedYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", price=" + price +
                '}';
    }
}
