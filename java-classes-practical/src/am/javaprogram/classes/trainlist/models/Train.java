package am.javaprogram.classes.trainlist.models;

import java.time.LocalDate;

public class Train {
    private int id;
    private String destination;
    private int seats;
    private int number;
    private String departureTime;
    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    public Train() { }

    public Train(String destination,int seats, int number, String departureTime) {
        this.id = noOfObjects;
        this.destination = destination;
        this.seats = seats;
        this.number = number;
        this.departureTime = departureTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", number=" + number +
                ", departureTime=" + departureTime +
                '}';
    }
}
