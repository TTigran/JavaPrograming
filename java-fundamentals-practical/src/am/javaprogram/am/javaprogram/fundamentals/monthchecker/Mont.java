package am.javaprogram.fundamentals.monthchecker;

import java.text.DateFormatSymbols;

public class Mont {
    public static String getMonthForInt(int num) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (num >= 0 && num <= 11) {
            month = months[num];
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(5);
    }
}
