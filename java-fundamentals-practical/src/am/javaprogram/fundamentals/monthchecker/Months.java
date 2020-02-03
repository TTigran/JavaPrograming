package am.javaprogram.fundamentals.monthchecker;

import java.util.Scanner;

public enum Months {
  JANUARY(1),
  FEBRUARY(2),
  MARCH(3),
  APRIL(4),
  MAY(5),
  JUNE(6),
  JULY(7),
  AUGUST(8),
  SEPTEMBER(9),
  OCTOBER(10),
  NOVEMBER(11),
  DECEMBER(12);

  private final int monthNumber;
  private static final int EXIT_COMMAND = 0;
  private static final Scanner SCANNER = new Scanner(System.in);

  /**
   * for gating Month's name
   *
   * @param monthNumber
   */
  Months(int monthNumber) {
    this.monthNumber = monthNumber;
  }

  /**
   * the getMonthByNumber method for return month's name by number
   *
   * @param monthNumber
   * @return month
   */
  public static Months getMonthByNumber(int monthNumber) {
    final var values = Months.values();
    for (Months month : values) {
      if (month.monthNumber == monthNumber) {
        return month;
      }
    }
    throw new IllegalArgumentException("There is no month with number: " + monthNumber);
  }

  /** printMonthNameByNumber method for print month by number. */
  public static void printMonthNameByNumber() {
    while (SCANNER.hasNext()) {
      int monthNumber = SCANNER.nextInt();
      if (EXIT_COMMAND == monthNumber) {
        System.out.println("Good By");
        SCANNER.close();
        break;
      } else {
        System.out.println(getMonthByNumber(monthNumber));
      }
    }
  }
}
