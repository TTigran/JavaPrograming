package am.javaprogram.classes.houselist.servicess;

import am.javaprogram.classes.houselist.HouseGenerator;
import am.javaprogram.classes.houselist.models.House;

public class HouseService {
    private House[] houses = new House[10];

    public HouseService() {
        HouseGenerator generator = new HouseGenerator();
        for (int i = 0; i < houses.length; i++) {
            houses[i] = generator.generateHouse();
        }
    }

    public void printData(House[] array) {
        for (House book : array) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }


    public House[] getByCountRoom(int countRoom) {
        int countFoundData = 0;
        House[] foundData = new House[houses.length];
        for (House house : houses) {
            if (house.getCountRoom() == countRoom) {
                foundData[countFoundData++] = house;
            }
        }
        return foundData;
    }

    public House[] getBySquare(String square) {
        int countFoundData = 0;
        House[] foundData = new House[houses.length];
        for (House house : houses) {
            if (house.getSquare().equals(square)) {
                foundData[countFoundData++] = house;
            }
        }
        return foundData;
    }

    public House[] getByCountRoomAndFloor(int countRoom,int floor) {
        int countFoundData = 0;
        House[] foundData = new House[houses.length];
        for (House house : houses) {
            if (house.getCountRoom() == countRoom && house.getFloor() == floor ) {
                foundData[countFoundData++] = house;
            }
        }
        return foundData;
    }
}
