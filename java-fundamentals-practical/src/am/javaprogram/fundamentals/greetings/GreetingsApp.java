package am.javaprogram.fundamentals.greetings;

import java.util.Scanner;

public class GreetingsApp {
     // fields  of  GreetingApp Class
  private Scanner scanner;
  private final String EXIT_VALUE = "exit";
  // printGreeting method  for  printing ""Hello `username`""
  private void printGreeting() {
    scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String user = scanner.next();
      if (EXIT_VALUE.equalsIgnoreCase(user)) {
        System.out.println("Good By");
        break;
      } else {
        System.out.println("Hello " + user);
      }
    }
  }
  // run method for running  GraetingApp's printing  proces
  public void run() {
    printGreeting();
  }
}
