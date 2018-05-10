package DateTime;

import java.util.Calendar;

//4. Write a Java program to get the minimum value of year, month, week, date from the current date of a default calendar.
public class DateTime_4 extends DateTime_3{
    public DateTime_4() {
        super();
    }

    private void printCalendarMinimumValues() {
        System.out.println("The minimum value of the Year: " + getCalendar().getActualMinimum(Calendar.YEAR));
        System.out.println("The minimum value of the Month: " + getCalendar().getActualMinimum(Calendar.MONTH));
        System.out.println("The minimum value of the week: " + getCalendar().getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("The minimum value of the date: " + getCalendar().getActualMinimum(Calendar.DATE));
    }

    @Override
    public void init() {
        printCurrentDate();
        printCalendarMinimumValues();
    }

    public static void main(String[] args) {
        new DateTime_4().init();
    }
}
