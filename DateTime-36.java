package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

//36. Write a Java program to convert a unix timestamp to date in Java.
public class DateTime_36 {
    private long unix_seconds = 1372339860;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a unix timestamp: ");
        unix_seconds = scanner.nextLong();
    }

    private void printDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        System.out.println(simpleDateFormat.format(new Date(unix_seconds * 1000)));
    }

    private void init() {
        input();
        printDate();
    }

    public static void main(String[] args) {
        new DateTime_36().init();
    }

}
