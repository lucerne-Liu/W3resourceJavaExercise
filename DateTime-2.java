package DateTime;

import java.util.Calendar;

//2. Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar.
public class DateTime_2 {
    private Calendar calendar;

    private DateTime_2() {
        calendar = Calendar.getInstance();
    }

    private void printCalendarInformation() {
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day: " + calendar.get(Calendar.DATE));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
    }

    public static void main(String[] args) {
        new DateTime_2().printCalendarInformation();
    }
}
