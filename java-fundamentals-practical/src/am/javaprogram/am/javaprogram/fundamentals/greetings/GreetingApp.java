package am.javaprogram.fundamentals.greetings;

import java.util.Scanner;

public class GreetingApp {
    // fields  of  GreetingApp Class
    private static final Scanner scanner = new Scanner(System.in);
    private final String EXIT_COMMAND = "exit";

    // run method for running  GraetingApp's printing  proces
    public void run() {
        printGreeting();
    }

    // printGreeting method  for  printing ""Hello `username`""
    private void printGreeting() {
        while (scanner.hasNext()) {
            String user = scanner.next();
            if (EXIT_COMMAND.equalsIgnoreCase(user)) {
                System.out.println("Good By");
                scanner.close();
                break;
            } else {
                System.out.println("Hello " + user);
            }
        }
    }
}
