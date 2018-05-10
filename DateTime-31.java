package DateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//31. Write a Java program to compute the difference between two dates (Hours, minutes, milli, seconds and nano)
public class DateTime_31 {
    private LocalDateTime firstDateTime;
    private LocalDateTime secondDateTime;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first datetime(yyyy-MM-dd HH:mm:ss): ");
        firstDateTime = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.print("Input the second datetime(yyyy-MM-dd HH:mm:ss): ");
        secondDateTime = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    private Duration getPeriodBetween() {
        return Duration.between(firstDateTime, secondDateTime);
    }

    private void printDifferenceBetweenDates() {
        System.out.printf("Difference is %d Hours, %d Minutes, %d Milli, %d Seconds and %d Nano\n",
                getPeriodBetween().toHours(), getPeriodBetween().toMinutes(), getPeriodBetween().toMillis(), getPeriodBetween().getSeconds(), getPeriodBetween().getNano() );
    }

    private void init(){
        input();
        printDifferenceBetweenDates();
    }

    public static void main(String[] args) {
        new DateTime_31().init();
    }
}
