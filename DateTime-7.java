package DateTime;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.Calendar;

//7. Write a Java program to get the last day of the current month.
public class DateTime_7 {
    private Calendar calendar;

    private DateTime_7() {
        calendar = Calendar.getInstance();
    }

    private void getLastDayOfCurrentMonth() {
        System.out.println("The last day of the current month is: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }

    public static void main(String[] args) {
        new DateTime_7().getLastDayOfCurrentMonth();
    }
}
