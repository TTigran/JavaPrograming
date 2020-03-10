package am.javaprogram.classes.carlist.models;

import java.time.LocalDate;

public class Book {
    private int id;
    private String author;
    private String namePublisher;
    private LocalDate date;
    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    public Book() { }

    public Book( String author, String namePublisher, String date) {
        this.id = noOfObjects;
        this.namePublisher = namePublisher;
        this.date = LocalDate.parse(date);
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", namePublisher='" + namePublisher + '\'' +
                ", date=" + date +
                '}';
    }
}
