package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//35. Write a Java program to extract date, time from the date string.
public class DateTime_35 {
    private Date date;

    public void input() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a date string(yyyy-MM-dd HH:mm:ss): ");
        date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(scanner.nextLine());
    }

    private void printDateAndTimeOfGivenString() {
        System.out.println("Date: " + new SimpleDateFormat("yyyy/MM/dd").format(date));
        System.out.println("Timee: " + new SimpleDateFormat("HH:mm:ss").format(date));
    }

    private void init() throws ParseException {
        input();
        printDateAndTimeOfGivenString();
    }

    public static void main(String[] args) throws ParseException {
        new DateTime_35().init();
    }
}
