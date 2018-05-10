package DateTime;

import java.time.Instant;

//20. Write a Java program to get current timestamp.
public class DateTime_20 {
    private Instant timeStamp;

    public DateTime_20() {
        timeStamp = Instant.now();
    }

    private void printCurrentTimeStamp() {
        System.out.println("Current Timestamp: " + timeStamp);
    }

    public static void main(String[] args) {
        new DateTime_20().printCurrentTimeStamp();
    }
}
