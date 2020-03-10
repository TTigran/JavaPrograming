package am.javaprogram.classes.booklist;

import am.javaprogram.classes.booklist.interfaces.Commands;
import am.javaprogram.classes.booklist.models.House;
import am.javaprogram.classes.booklist.servicess.BookService;

import java.util.Scanner;

public class Commander implements Commands {
    BookService bookService = new BookService();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        printCommands();
        int command = scanner.nextInt();
        switch (command) {
            case EXIT:
                scanner.close();
                break;
            case FILTER_BY_NAME_PUBLISHER:
                filteringByNamePublisherProcess();
                break;
            case FILTER_BY_AUTHOR:
                filteringByAuthorProcess();
                break;
            case FILTER_BY_FROM_YEAR:
                filteringByFromYearProcess();
                break;
            default:
                run();
                break;
        }
    }

    private void filteringByNamePublisherProcess() {
        Scanner scanner = new Scanner(System.in);
        String namePublisher = scanner.nextLine();
        House[] result = bookService.getByNamePublisher(namePublisher);
        bookService.printData(result);
        run();
    }

    private void filteringByAuthorProcess() {
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        House[] result = bookService.getByNamePublisher(author);
        bookService.printData(result);
        run();
    }

    private void filteringByFromYearProcess() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year < 2002) {
            House[] result = bookService.getByFromYear(year);
            bookService.printData(result);
        } else {
            System.out.println(year+" is not allowed: Please try again");
            filteringByFromYearProcess();
        }
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
