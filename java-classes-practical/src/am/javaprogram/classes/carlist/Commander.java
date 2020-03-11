package am.javaprogram.classes.carlist;

import am.javaprogram.classes.carlist.constcommands.Commands;
import am.javaprogram.classes.carlist.models.Car;
import am.javaprogram.classes.carlist.servicess.CarService;

import java.util.Scanner;

public class Commander implements Commands {
    CarService carService = new CarService();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        printCommands();
        int command = scanner.nextInt();
        switch (command) {
            case EXIT:
                scanner.close();
                break;
            case FILTER_BY_BRAND:
                processFilterByBrand();
                break;
            case FILTER_BY_MODEL_AND_OPERATED_MORE_YEAR:
                processFilterByModelAndMoreOperatedYear();
                break;
            case FILTER_BY_YEAR_OF_ISSUE_AND_MORE_PRICE:
                processFilterByYearIssueAndMorePrice();
                break;
            default:
                run();
                break;
        }
    }

    private void processFilterByBrand() {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        Car[] byBrand = carService.getByBrand(brand);
        carService.printData(byBrand);
        scanner.close();
        run();
    }

    private void processFilterByYearIssueAndMorePrice() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int price = scanner.nextInt();
        Car[] byFromYearIssue = carService.getByFromYearIssue(year, price);
        carService.printData(byFromYearIssue);
        scanner.close();
        run();
    }

    private void processFilterByModelAndMoreOperatedYear() {
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        int operatedYear = scanner.nextInt();
        Car[] byModelAndOperatedYear = carService.getByModelAndOperatedYear(model, operatedYear);
        carService.printData(byModelAndOperatedYear);
        scanner.close();
        run();
    }

    private void printCommands() {
        System.out.println("EXIT -------------------------------------------------------> 0");
        System.out.println("FILTER_BY_BRAND --------------------------------------------> 1");
        System.out.println("FILTER_BY_MODEL_AND_OPERATED_MORE_YEAR ---------------------> 2");
        System.out.println("FILTER_BY_YEAR_OF_ISSUE_AND_MORE_PRICE ---------------------> 3");
    }
}
