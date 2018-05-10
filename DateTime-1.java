package DateTime;

import java.util.Calendar;
import java.util.Date;

//1. Write a Java program to create a Date object using the Calendar class.
public class DateTime_1 {

    public static Date createDate() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    public static void main(String[] args) {
        System.out.println(DateTime_1.createDate());
    }
}
