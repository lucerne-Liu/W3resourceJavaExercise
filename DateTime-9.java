package DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//9. Write a Java program to calculate the first and last day of each week.
public class DateTime_9 {
    private Calendar calendar;

    public DateTime_9() {
        calendar = Calendar.getInstance();
    }

    private void printFirstAndLastDay() {
        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONTH);
        System.out.println("The first day of the week is: " + dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_WEEK, 6);
        System.out.println("The last day of the week is: " + dateFormat.format(calendar.getTime()));

    }

    public static void main(String[] args) {
        new DateTime_9().printFirstAndLastDay();
    }
}
