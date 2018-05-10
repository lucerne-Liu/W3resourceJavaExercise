package DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

//26. Write a Java program to get the information of current/given month.
//
//        Sample format :
//
//        Sample Output :
//        Integer value of the current month: 2
//        Length of the month: 28
//        Maximum length of the month: 29
//        First month of the Quarter: JANUARY
public class DateTime_26 {
    private LocalDate localDate;

    public DateTime_26() {
        localDate = LocalDate.now();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a month(1-12): ");
        localDate = LocalDate.of(localDate.getYear(), scanner.nextInt(), localDate.getDayOfMonth());
    }

    private void printResult() {
        Month month = localDate.getMonth();
        System.out.println("Integer value of the current month: " + month.getValue());
        System.out.println("Length of the month: " + month.minLength());
        System.out.println("Maximum length of the month: " + month.maxLength());
        System.out.println("First month of the Quarter: " + month.firstMonthOfQuarter());
    }

    private void init(){
        printResult();
        input();
        printResult();
    }

    public static void main(String[] args) {
        new DateTime_26().init();
    }
}
