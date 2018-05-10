package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

//23. Write a Java program to get the months remaining in the year.
public class DateTime_23 {
    private LocalDate localDate;

    public DateTime_23() {
        localDate = LocalDate.now();
    }

    private void printMonthRemainingInYear() {
        LocalDate lastDate = localDate.with(TemporalAdjusters.lastDayOfYear());
        Period period = Period.between(localDate, lastDate);
//        Period period = localDate.until(lastDate);
        System.out.println("Months remaining in the year: " + period.getMonths());
    }

    public static void main(String[] args) {
        new DateTime_23().printMonthRemainingInYear();
    }
}
