package am.javaprogram.classes.houselist;

import am.javaprogram.classes.houselist.constcommands.Commands;
import am.javaprogram.classes.houselist.models.House;
import am.javaprogram.classes.houselist.servicess.HouseService;

import java.util.Scanner;

public class Commander implements Commands {
    HouseService houseService = new HouseService();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        printCommands();
        int command = scanner.nextInt();
        switch (command) {
            case EXIT:
                scanner.close();
                break;
            case FILTER_BY_COUNT_ROOM:
                filteringByCountRoomProcess();
                break;
            case FILTER_BY_COUNT_ROOM_AND_FLOOR:
                filteringByCountRoomAndFloorProcess();
                break;
            case FILTER_BY_SQUARE:
                filteringBySquare();
                break;
            default:
                run();
                break;
        }
    }

    private void filteringByCountRoomProcess() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        House [] result = houseService.getByCountRoom(count);
        houseService.printData(result);
        scanner.close();
        run();
    }

    private void filteringByCountRoomAndFloorProcess() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int floor = scanner.nextInt();
        House [] result = houseService.getByCountRoomAndFloor(count,floor);
        houseService.printData(result);
        scanner.close();
        run();
    }

    private void filteringBySquare() {
        Scanner scanner = new Scanner(System.in);
        String square = scanner.nextLine();
        House [] result = houseService.getBySquare(square);
        houseService.printData(result);
        scanner.close();
        run();
    }

    private void printCommands() {
        System.out.println("EXIT -------------------------------------------------> 0");
        System.out.println("FILTER_BY_COUNT_ROOM ---------------------------------> 1");
        System.out.println("FILTER_BY_COUNT_ROOM_AND_FLOOR -----------------------> 2");
        System.out.println("FILTER_BY_SQUARE -------------------------------------> 3");
    }
}
