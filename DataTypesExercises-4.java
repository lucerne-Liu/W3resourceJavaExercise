package DataTypesExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//4. Write a Java program to convert minutes into a number of years and days.
//
//        Test Data
//        Input the number of minutes: 3456789
//        Expected Output :
//        3456789 minutes is approximately 6 years and 210 days
public class DataTypesExercises_4 {
    private static final int MINUTES_OF_A_DAY = 24 * 60;
    private static final int MINUTES_OF_A_YEAR = 365 * MINUTES_OF_A_DAY;
    private int inputMinutes;

    private void input() {
        System.out.print("Input the number of minutes: ");
        Scanner scanner = new Scanner(System.in);
        inputMinutes = scanner.nextInt();
    }

    private Map<String, Integer> convertMinutesIntoYearsAndDays() {
        Map<String, Integer> map = new HashMap<>();
        map.put("years", inputMinutes / MINUTES_OF_A_YEAR);
        map.put("days", inputMinutes % MINUTES_OF_A_YEAR / MINUTES_OF_A_DAY);
        return map;
    }

    private void printResult() {
        System.out.println(inputMinutes + " minutes is approximately " + convertMinutesIntoYearsAndDays().get("years") + " years and " + convertMinutesIntoYearsAndDays().get("days") + " days");
    }

    private void init() {
        input();
        printResult();
    }

    public static void main(String[] args) {
        new DataTypesExercises_4().init();
    }
}
