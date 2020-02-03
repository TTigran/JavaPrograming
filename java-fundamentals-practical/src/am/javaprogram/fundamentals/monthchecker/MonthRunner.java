package am.javaprogram.fundamentals.monthchecker;

public class MonthRunner {
  public static void main(String[] args) {
    final var month = new Month();
    month.run();

    /** Its called from Months Enum */
    Months.printMonthNameByNumber();
  }
}
