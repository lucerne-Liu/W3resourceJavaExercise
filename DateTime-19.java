package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//19. Write a Java program to get year and months between two dates.
public class DateTime_19 {
    private LocalDate firstDay;
    private LocalDate secondDay;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first year(YYYY-MM-DD): ");
        firstDay = LocalDate.parse(scanner.next());
        System.out.print("Input the second year(YYYY-MM-DD): ");
        secondDay = LocalDate.parse(scanner.next());
    }

    public Period getPeriodBetween() {
        return Period.between(firstDay, secondDay);
    }

    private void printYearAndMonthGapBetweenDates() {
        System.out.println("Difference between " + firstDay + " and " + secondDay + ": "
                + getPeriodBetween().getYears() + " Year(s) and " + getPeriodBetween().getMonths() + " Month(s)");
    }

    private void init(){
        input();
        printYearAndMonthGapBetweenDates();
    }

    public static void main(String[] args) {
        new DateTime_19().init();
    }

}
