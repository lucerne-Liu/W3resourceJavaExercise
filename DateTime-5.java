package DateTime;

import java.util.Calendar;
import java.util.TimeZone;

//5. Write a Java program to get the current time in New York.
public class DateTime_5 {
    private Calendar calendar;

    private DateTime_5() {
        calendar = Calendar.getInstance();
    }

    private String getCurrentTimeInNewYork() {
        calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        return calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
    }

    private void printCurrentTimeInNewYork() {
        System.out.println("Current time in New York is: " + getCurrentTimeInNewYork());
    }

    public static void main(String[] args) {
        new DateTime_5().printCurrentTimeInNewYork();
    }
}
