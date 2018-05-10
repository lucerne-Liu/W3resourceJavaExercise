package DateTime;

import java.time.LocalTime;

//14. Write a Java program to get the current local time.
public class DateTime_14 {
    private LocalTime localTime;

    public DateTime_14() {
        localTime = LocalTime.now();
    }

    private void printCurrentLocalTime() {
        System.out.println("The current local time is: " + localTime);
    }

    public static void main(String[] args) {
        new DateTime_14().printCurrentLocalTime();
    }
}
