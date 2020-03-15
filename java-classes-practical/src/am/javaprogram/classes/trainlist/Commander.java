package am.javaprogram.classes.trainlist;

import am.javaprogram.classes.trainlist.constcommands.Commands;
import am.javaprogram.classes.trainlist.models.Train;
import am.javaprogram.classes.trainlist.servicess.TrainService;

import java.util.Scanner;

public class Commander implements Commands {
    TrainService trainService = new TrainService();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        printCommands();
        int command = scanner.nextInt();
        switch (command) {
            case EXIT:
                scanner.close();
                break;
            case FILTER_BY_DESTINATION:
                filteringProcessByDestination();
                break;
            case FILTER_BY_DESTINATION_AND_TIME:
                filteringProcessByDestinationAndAfterDepartureTime();
                break;
            case FILTER_BY_DESTINATION_AND_SEATS:
                filteringProcessByDestinationAndSeats();
                break;
            default:
                run();
                break;
        }
    }

    private void filteringProcessByDestination() {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        Train[] result = trainService.getByDestination(destination);
        trainService.printData(result);
        scanner.close();
        run();
    }

    private void filteringProcessByDestinationAndAfterDepartureTime() {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String depTime = scanner.nextLine();
        Train[] result = trainService.getByDestinationAndAfterDepartureTime(destination, depTime);
        trainService.printData(result);
        run();
    }

    private void filteringProcessByDestinationAndSeats() {
        Scanner scanner = new Scanner(System.in);
        int seats = scanner.nextInt();
        String destination = scanner.nextLine();
        Train[] result = trainService.getByDestinationAndNumberSeats(destination,seats);
        trainService.printData(result);
        scanner.close();
        run();
    }

    private void printCommands() {
        System.out.println("EXIT ----------------------------------------------------------------> 0");
        System.out.println("FILTER_BY_NAME_PUBLISHER --------------------------------------------> 1");
        System.out.println("FILTER_BY_AUTHOR ----------------------------------------------------> 2");
        System.out.println("FILTER_BY_FROM_YEAR -------------------------------------------------> 3");
    }
}
