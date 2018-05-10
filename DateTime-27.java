package DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//27. Write a Java program to get the information of a given time.
public class DateTime_27 {
    private LocalTime localTime;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a time(hh:mm:ss): ");
        localTime = LocalTime.parse(scanner.next(), DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    private void printInformationOfGivenTime() {
        System.out.println("Current Local time: " + localTime);
        System.out.println("Hour: " + localTime.getHour());
        System.out.println("Minue: " + localTime.getMinute());
        System.out.println("Second: " +localTime.getSecond());
    }

    private void init(){
        input();
        printInformationOfGivenTime();
    }

    public static void main(String[] args) {
        new DateTime_27().init();
    }
}
