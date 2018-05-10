package DateTime;

import java.util.Calendar;

//3. Write a Java program to get the maximum value of the year, month, week, date from the current date of a default calendar.
public class DateTime_3 {
    private Calendar calendar;

    public DateTime_3() {
        calendar = Calendar.getInstance();
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void printCurrentDate() {
        System.out.println("Current time is: " + calendar.getTime());
    }

    private void printCalendarMaximumValues() {
        System.out.println("The maximum value of the Year: " + calendar.getActualMaximum(Calendar.YEAR));
        System.out.println("The maximum value of the Month: " + calendar.getActualMaximum(Calendar.MONTH));
        System.out.println("The maximum value of the week: " + calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("The maximum value of the date: " + calendar.getActualMaximum(Calendar.DATE));
    }

    public void init() {
        printCurrentDate();
        printCalendarMaximumValues();
    }

    public static void main(String[] args) {
        new DateTime_3().init();
    }
}
