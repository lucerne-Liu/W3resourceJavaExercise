package DateTime;

import java.util.Calendar;
import java.util.Scanner;

//13. Write a Java program to get a day of the week of a specific date.
public class DateTime_13 {
    private int date;
    private Calendar calendar;

    private DateTime_13() {
        calendar = Calendar.getInstance();
    }

    private void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a date of the current month: ");
        date = scanner.nextInt();
    }

    private int getWeekOfGivenDate() {
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    private void printWeekOfGivenDate() {
        System.out.println("The day of the week of the given date is: " + getWeekOfGivenDate());
    }

    private void init(){
        input();
        printWeekOfGivenDate();
    }

    public static void main(String[] args) {
        new DateTime_13().init();
    }
}
