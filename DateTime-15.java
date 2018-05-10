package DateTime;


import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

//15. Write a Java program to add some hours to the current time.
public class DateTime_15 {
    private LocalTime localTime;
    private int addHour;

    private DateTime_15() {
        localTime = LocalTime.now();
    }

    private void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number add to the hour: ");
        addHour = scanner.nextInt();
    }

    private void printTimeAfterGivenHours() {
        System.out.printf("Time after %d hours: %tR", addHour, localTime.plusHours(addHour));
    }

    private void init(){
        input();
        printTimeAfterGivenHours();
    }

    public static void main(String[] args) {
        new DateTime_15().init();
    }
}
