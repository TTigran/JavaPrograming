package fundamentals.monthchecker;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Month {
    // fields  of  CalculatApp Class
    static Scanner scanner = new Scanner(System.in);
    static DateFormatSymbols dfs = new DateFormatSymbols();
    private final int EXIT_COMMAND = 0;

    // run method for running  Monts's printing  proces
    public void run() {
        printMonthNameByNumber();
    }

    // getMonthForInt  method   for  get name of monts
    private static String getMonthForInt(int number) {
        int num = number-1;
        String month = "Wrong number";
        String[] months = dfs.getMonths();
        if (num >= 0 && num <= 11) {
            month = months[num];
        }
        return month;
    }

    // printMonthNameByNumber method for showing name of  month
    private void printMonthNameByNumber() {
        while (scanner.hasNext()) {
            int  monthNumber = scanner.nextInt();
            if (EXIT_COMMAND == monthNumber) {
                System.out.println("Good By");
                scanner.close();
                break;
            } else {
                System.out.println(getMonthForInt(monthNumber));
            }
        }
    }
}
