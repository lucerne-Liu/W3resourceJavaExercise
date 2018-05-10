package DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//6. Write a Java program to get current full date and time.
public class DateTime_6 {
    private Calendar calendar;

    public DateTime_6() {
        calendar = Calendar.getInstance();
    }

    private String getCurrentFullDateAndTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss.SSS");
        return simpleDateFormat.format(calendar.getTime());
    }

    private void printCurrentFullDateAndTime() {
        System.out.println("Current full date and time is: " + getCurrentFullDateAndTime());
    }

    public static void main(String[] args) {
        new DateTime_6().printCurrentFullDateAndTime();
    }
}
