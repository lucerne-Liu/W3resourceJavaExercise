package DateTime;

import java.util.Calendar;
import java.util.Date;

//17. Write a Java program to get a date before and after 1 year compares to the current date.
public class DateTime_17 {
    private Calendar calendar;

    public DateTime_17() {
        calendar = Calendar.getInstance();
    }

    private Date printDateWithModifiedYear(int addYears) {
        calendar.add(Calendar.YEAR, addYears);
        return calendar.getTime();
    }

    private void init() {
        System.out.println("Current date: " + calendar.getTime());
        System.out.println("Date before 1 year: " + printDateWithModifiedYear(-1));
        System.out.println("Date after 1 year: " + printDateWithModifiedYear(2));
    }

    public static void main(String[] args) {
        new DateTime_17().init();
    }
}
