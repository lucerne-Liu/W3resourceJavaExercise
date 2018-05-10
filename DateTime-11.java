package DateTime;

import java.util.Calendar;

//11. Write a Java program to get the number of days of a month.
public class DateTime_11 {
    private Calendar calendar;

    public DateTime_11() {
        calendar = Calendar.getInstance();
    }

    private void printNumberOfDaysOfMonth() {
        System.out.println("Number of days of the current month: " + calendar.getMaximum(Calendar.DAY_OF_MONTH));
    }

    public static void main(String[] args) {
        new DateTime_11().printNumberOfDaysOfMonth();
    }
}
