package DateTime;

import java.time.LocalDateTime;
import java.util.Scanner;

//28. Write a Java program to display the date time information before some hours and minutes from current date time.
public class DateTime_28 {
    private LocalDateTime localDateTime;
    private int beforeHours;
    private int beforeMinutes;

    public DateTime_28() {
        localDateTime = LocalDateTime.now();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input before hours: ");
        beforeHours = scanner.nextInt();
        System.out.print("Input before minutes: ");
        beforeMinutes = scanner.nextInt();
    }

    private void printMinusResult() {
        LocalDateTime newDateTime = localDateTime.minusHours(beforeHours).minusMinutes(beforeMinutes);
        System.out.println("Current Date and Time:  " + localDateTime);
        System.out.printf("Before %d houres and %d minutes: ",beforeHours,beforeMinutes);
        System.out.print(newDateTime);
    }

    private void init(){
        input();
        printMinusResult();
    }

    public static void main(String[] args) {
        new DateTime_28().init();
    }
}
