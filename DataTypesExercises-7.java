package DataTypesExercises;

import java.util.Scanner;

//7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds),
// and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). Go to the editor
//
//        Test Data
//        Input distance in meters: 2500
//        Input hour: 5
//        Input minutes: 56
//        Input seconds: 23
//        Expected Output :
//        Your speed in meters/second is 0.11691531
//        Your speed in km/h is 0.42089513
//        Your speed in miles/h is 0.26158804
public class DataTypesExercises_7 {
    private static final int SECONDS_OF_A_MINUTE = 60;
    private static final int SECOND_OF_AN_HOUR = 60 * SECONDS_OF_A_MINUTE;
    private static final String METERS_PER_SECOND = "meters/second";
    private static final String KILOMETERS_PER_HOUR = "km/h";
    private static final String MILES_PER_HOUR = "miles/h";
    private double meters;
    private int hour;
    private int minutes;
    private int seconds;

    private void input() {
        System.out.print("Input distance in meters: ");
        Scanner scanner = new Scanner(System.in);
        meters = scanner.nextDouble();
        System.out.print("Input hour: ");
        hour = scanner.nextInt();
        System.out.print("Input minutes: ");
        minutes = scanner.nextInt();
        System.out.print("Input seconds: ");
        seconds = scanner.nextInt();
    }

    private int getTotalSeconds() {
        return hour * SECOND_OF_AN_HOUR + minutes * SECONDS_OF_A_MINUTE + seconds;
    }

    private double getTotalHours() {
        return (double) getTotalSeconds() / SECOND_OF_AN_HOUR;
    }

    private double convertMetersIntoMile() {
        return meters / 1609;
    }

    private double convertMetersIntoKiloMeters() {
        return meters / 1000;
    }

    private double getSpeedInGivenUnit(String givenUnit) {
        switch (givenUnit) {
            case METERS_PER_SECOND:
                return meters / getTotalSeconds();
            case KILOMETERS_PER_HOUR:
                return convertMetersIntoKiloMeters() / getTotalHours();
            case MILES_PER_HOUR:
                return convertMetersIntoMile() / getTotalHours();
            default:
                return 0;
        }
    }

    private void printResult(String givenUnit) {
        System.out.println(String.format("Your speed in %s is %.8f", givenUnit, getSpeedInGivenUnit(givenUnit)));
    }

    private void init() {
        input();
        printResult(METERS_PER_SECOND);
        printResult(KILOMETERS_PER_HOUR);
        printResult(MILES_PER_HOUR);
    }

    public static void main(String[] args) {
        new DataTypesExercises_7().init();
    }
}
