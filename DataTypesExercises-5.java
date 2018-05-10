package DataTypesExercises;

import sun.rmi.runtime.NewThreadAction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

//5. Write a Java program that prints the current time in GMT.
//
//        Test Data
//        Input the time zone offset to GMT: 256
//        Expected Output:
//        Current time is 23:40:24
public class DataTypesExercises_5 {
    private static final int Millis_OF_A_HOUR = 60 * 1000;
    private int timeZoneOffset;

    private void input() {
        System.out.print("Input the time zone offset to GMT: ");
        Scanner scanner = new Scanner(System.in);
        timeZoneOffset = scanner.nextInt();
    }

    private void printCurrentTimeInGMT() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneOffset) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    private void init() {
        input();
        printCurrentTimeInGMT();
    }

    public static void main(String[] args) {
        new DataTypesExercises_5().init();
    }
}
