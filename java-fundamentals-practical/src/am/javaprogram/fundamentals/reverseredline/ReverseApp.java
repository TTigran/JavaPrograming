package am.javaprogram.fundamentals.reverseredline;

import java.util.Scanner;

public class ReverseApp {
  private static final Scanner SCANNER = new Scanner(System.in);
  private static final String EXIT_COMMAND = "exit";

  /** run method for running process ReverserApp */
  public void run() {
    printReverse();
  }

  /**
   * reverseString for reversing logic for app
   *
   * @param line
   * @return result
   */
  private String reverseString(String line) {
    StringBuilder result = new StringBuilder();
    for (int i = line.length() - 1; i >= 0; i--) {
      result.append(line.charAt(i));
    }
    return result.toString();
  }

  /** printReverse for printing our reversed line */
  private void printReverse() {
    while (SCANNER.hasNext()) {
      String line = SCANNER.nextLine();
      if (EXIT_COMMAND.equalsIgnoreCase(line)) {
        System.out.println("Good By");
        SCANNER.close();
        break;
      } else {
        System.out.println(reverseString(line));
      }
    }
  }
}
