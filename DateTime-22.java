package DateTime;

import java.time.LocalDate;

//22. Write a Java program to get the dates 10 days before and after today.
public class DateTime_22 {
    private LocalDate localDate;

    public DateTime_22() {
        localDate = LocalDate.now();
    }

    private void printTenDaysBeforeAndAfterToday() {
        System.out.println("Current date: " + localDate);
        System.out.println("10 days before today: " + localDate.plusDays(-10));
        System.out.println("10 days after today: " + localDate.plusDays(10));
    }

    public static void main(String[] args) {
        new DateTime_22().printTenDaysBeforeAndAfterToday();
    }

}
