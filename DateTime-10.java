package DateTime;

import sun.misc.Cache;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Locale;

//10. Write a Java program to get the name of the first and last day of a month.
public class DateTime_10 {
    private Calendar calendar;

    private DateTime_10() {
        calendar = Calendar.getInstance();
    }

    private void printFirstAndLastDayOfMonth() {
        DateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        System.out.println(dateFormat.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    private void printFirstAndLastDay() {
        YearMonth ym = YearMonth.of(2018, 5);
        String firstDay = ym.atDay(1).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println(firstDay);
        System.out.println(lastDay);
    }

    public static void main(String[] args) {
        new DateTime_10().printFirstAndLastDayOfMonth();
//        new DateTime_10().printFirstAndLastDay();
    }
}
