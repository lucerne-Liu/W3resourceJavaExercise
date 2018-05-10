package DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

//34. Write a Java program to get today's date at midnight time.
public class DateTime_34 {
    private Calendar calendar;

    public DateTime_34() {
        calendar = new GregorianCalendar();
    }

    private void printCurrentDateInMidnightTime() {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println("Today's date at midnight time: " + calendar.getTime());
    }

    public static void main(String[] args) {
        new DateTime_34().printCurrentDateInMidnightTime();
    }
}
