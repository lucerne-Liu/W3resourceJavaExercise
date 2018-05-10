package DateTime;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

//12. Write a Java program to get localized day-in-week name.
public class DateTime_12 {
    private Calendar calendar;

    public DateTime_12() {
        calendar = Calendar.getInstance();
    }

    private String getLocalizedWeekName() {
        DateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return dateFormat.format(calendar.get(Calendar.DAY_OF_WEEK));
    }

    private void printLocalizedWeekName() {
//        System.out.println("The localized day-in-week name is: " + getLocalizedWeekName());
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("en"));
        String[] dayNames = symbols.getWeekdays();
        Arrays.stream(dayNames).forEach(System.out::println);
    }

    public static void main(String[] args) {
        new DateTime_12().printLocalizedWeekName();
    }
}
