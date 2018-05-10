package DateTime;

import java.util.Calendar;
import java.util.Date;

//8. Write a Java program to get the last date of the month.
public class DateTime_8{
    private Calendar calendar;

    private DateTime_8() {
        calendar = Calendar.getInstance();
    }

    private Date getLastDateOfMonth() {
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    private void printLastDateOfCurrentMonth() {
        System.out.println("The last date the current month is: " + getLastDateOfMonth());
    }

    public static void main(String[] args) {
        new DateTime_8().printLastDateOfCurrentMonth();
    }
}
