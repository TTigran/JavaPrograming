package am.javaprogram.fundamentals.reverseredline;

import java.util.Scanner;

public class ReverseApp {
  private static final Scanner scanner = new Scanner(System.in);
  private static final String EXIT_COMMAND = "exit";

  public void run() {
    printReverse();
  }

  private String reverseString(String line) {
    StringBuilder result = new StringBuilder();
    for (int i = line.length() - 1; i >= 0; i--) {
      result.append(line.charAt(i));
    }
    return result.toString();
  }

  private void printReverse() {
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (EXIT_COMMAND.equalsIgnoreCase(line)) {
        System.out.println("Good By");
        scanner.close();
        break;
      } else {
        System.out.println(reverseString(line));
      }
    }
  }
}
