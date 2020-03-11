package am.javaprogram.classes.productlist;

import am.javaprogram.classes.productlist.constcommands.Commands;
import am.javaprogram.classes.productlist.models.Product;
import am.javaprogram.classes.productlist.servicess.ProductService;

import java.util.Scanner;

public class Commander implements Commands {
    ProductService productService = new ProductService();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        printCommands();
        int command = scanner.nextInt();
        switch (command) {
            case EXIT:
                scanner.close();
                break;
            case FILTER_BY_PRICE:
                filteringByPriceProcess();
                break;
            case FILTER_BY_NAME:
                filteringByNameProcess();
                break;
            case FILTER_BY_GUARANTY:
                filteringByGuarantyProcess();
                break;
            default:
                run();
                break;
        }
    }

    private void filteringByPriceProcess() {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        Product[] byPrice = productService.getByPrice(price);
        productService.printData(byPrice);
        scanner.close();
        run();
    }


    private void filteringByNameProcess() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Product[] byName = productService.getByName(name);
        productService.printData(byName);
        scanner.close();
        run();
    }

    private void filteringByGuarantyProcess() {
        Scanner scanner = new Scanner(System.in);
        String guaranty = scanner.nextLine();
        Product[] byName = productService.getByName(guaranty);
        productService.printData(byName);
        scanner.close();
        run();
    }

    private void printCommands() {
        System.out.println("EXIT -------------------------------------------------------> 0");
        System.out.println("FILTER_BY_PRICE --------------------------------------------> 1");
        System.out.println("FILTER_BY_NAME ---------------------------------------------> 2");
        System.out.println("FILTER_BY_GUARANTY -----------------------------------------> 3");
    }
}
