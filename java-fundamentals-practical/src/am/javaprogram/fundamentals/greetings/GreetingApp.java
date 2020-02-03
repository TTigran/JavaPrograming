package am.javaprogram.fundamentals.greetings;

import java.util.Scanner;

public class GreetingApp {
  private static final Scanner SCANNER = new Scanner(System.in);
  private static final String EXIT_COMMAND = "exit";

  /** run method for running Greeting process. */
  public void run() {
    printGreeting();
  }

  /** printGreeting method for printing scanner by scanner. */
  private void printGreeting() {
    while (SCANNER.hasNext()) {
      String user = SCANNER.nextLine();
      if (EXIT_COMMAND.equalsIgnoreCase(user)) {
        System.out.println("Good By");
        SCANNER.close();
        break;
      } else {
        System.out.println("Hello " + user);
      }
    }
  }
}
