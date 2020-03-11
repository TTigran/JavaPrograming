package am.javaprogram.classes.customer;

import am.javaprogram.classes.customer.models.Customer;
import am.javaprogram.classes.customer.sevices.CustomerService;
import am.javaprogram.classes.customer.constcommands.Commands;

import java.util.Scanner;

public class Commander implements Commands {
  CustomerService customerService = new CustomerService();

  public void run() {
    Scanner scanner = new Scanner(System.in);
    printCommands();
    int command = scanner.nextInt();
    switch (command) {
      case EXIT:
        scanner.close();
        break;
      case SORT_BY_NAME:
        sortingProcess();
        break;
      case GET_CUSTOMER_BY_INTERVAL_OF_NUMBER_CART:
        getByIntervalOfCartNumberProcess();
        break;
      default:
        run();
        break;
    }
  }

  private void sortingProcess() {
    Customer[] sort = customerService.sort();
    customerService.printData(sort);
    run();
  }

  private void getByIntervalOfCartNumberProcess(){
    Scanner scanner = new Scanner(System.in);
    long  startInterval = scanner.nextLong();
    long  endInterval = scanner.nextLong();
    Customer[] sort = customerService.getListByIntervalOfNumberCart(startInterval,endInterval);
    customerService.printData(sort);
    run();
  }

  private void printCommands() {
    System.out.println("EXIT ----------------------------------------------------> 0");
    System.out.println("SORT_BY_NAME --------------------------------------------> 1");
    System.out.println("GET_CUSTOMER_BY_INTERVAL_OF_NUMBER_CART -----------------> 2");
  }
}
