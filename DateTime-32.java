package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//32. Write a Java program to calculate your age.
public class DateTime_32 {
    private LocalDate birthDay;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the birthday(YYYY-MM-DD): ");
        birthDay = LocalDate.parse(scanner.next());
    }

    private Period getPeriodBetween() {
        return Period.between(birthDay, LocalDate.now());
    }

    private void printAge() {
        System.out.printf("I am  %d years, %d months and %d days old.\n",
                getPeriodBetween().getYears(), getPeriodBetween().getMonths(), getPeriodBetween().getDays());
    }

    private void init(){
        input();
        printAge();
    }

    public static void main(String[] args) {
        new DateTime_32().init();
    }
}
