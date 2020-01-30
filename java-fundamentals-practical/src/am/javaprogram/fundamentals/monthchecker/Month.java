package am.javaprogram.fundamentals.monthchecker;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Month {
  private static final int EXIT_COMMAND = 0;
  private static Scanner scanner = new Scanner(System.in);
  private static DateFormatSymbols dfs = new DateFormatSymbols();

  /** Run print month by number app. */
  public void run() {
    printMonthNameByNumber();
  }

  private void printMonthNameByNumber() {
    while (scanner.hasNext()) {
      int monthNumber = scanner.nextInt();
      if (EXIT_COMMAND == monthNumber) {
        System.out.println("Good By");
        scanner.close();
        break;
      } else {
        System.out.println(getMonthForInt(monthNumber));
      }
    }
  }

  private String getMonthForInt(int number) {
    int num = number - 1;
    String month = "Wrong number";
    String[] months = dfs.getMonths();
    if (num >= 0 && num <= 11) {
      month = months[num];
    }
    return month;
  }
}
