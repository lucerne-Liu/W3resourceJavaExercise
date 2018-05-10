package DateTime;

import java.util.Calendar;

//16. Write a Java program to get a date after 2 weeks.
public class DateTime_16 {
    private Calendar calendar;

    public DateTime_16() {
        calendar = Calendar.getInstance();
    }

    private void printDateAfterTwoWeeks() {
        calendar.add(Calendar.WEEK_OF_YEAR, 2);
        System.out.println("Date after 2 weeks: " + calendar.getTime());
    }

    public static void main(String[] args) {
        new DateTime_16().printDateAfterTwoWeeks();
    }
}
