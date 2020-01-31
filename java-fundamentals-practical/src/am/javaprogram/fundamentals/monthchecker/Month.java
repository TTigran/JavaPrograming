package am.javaprogram.fundamentals.monthchecker;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Month {
  private static final int EXIT_COMMAND = 0;
  private static Scanner SCANNER = new Scanner(System.in);
  private static DateFormatSymbols dfs = new DateFormatSymbols();

  /** Run print month by number app. */
  public void run() {
    printMonthNameByNumber();
  }

  /** getMonthForInt method for get month by number. */
  private String getMonthForInt(int number) {
    int num = number - 1;
    String month = "Wrong number";
    String[] months = dfs.getMonths();
    if (num >= 0 && num <= 11) {
      month = months[num];
    } else {
      throw new IllegalArgumentException("There is no month with number: " + number);
    }
    return month;
  }

  /** printMonthNameByNumber method for print month by number. */
  private void printMonthNameByNumber() {
    while (SCANNER.hasNext()) {
      int monthNumber = SCANNER.nextInt();
      if (EXIT_COMMAND == monthNumber) {
        System.out.println("Good By");
        SCANNER.close();
        break;
      } else {
        System.out.println(getMonthForInt(monthNumber));
      }
    }
  }
}
