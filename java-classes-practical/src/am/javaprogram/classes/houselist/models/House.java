package am.javaprogram.classes.houselist.models;

import java.time.LocalDate;

public class House {
    private int id;
    private int floor;
    private String  square;
    private int countRoom;
    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    public House() { }

    public House(int floor, String square, int countRoom) {
        this.id = noOfObjects;
        this.floor = floor;
        this.square = square;
        this.countRoom = countRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public int getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }



    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", floor=" + floor +
                ", square='" + square + '\'' +
                ", countRoom=" + countRoom +
                '}';
    }
}
