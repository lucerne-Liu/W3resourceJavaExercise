package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

//33. Write a Java program to get the next and previous Friday.
public class DateTime_33 {
    private LocalDate localDate;

    public DateTime_33() {
        localDate = LocalDate.now();
    }

    private void printNextAndPreviousFriday() {
        System.out.println("Next Friday: " + localDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: " + localDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    }

    public static void main(String[] args) {
        new DateTime_33().printNextAndPreviousFriday();
    }
}
