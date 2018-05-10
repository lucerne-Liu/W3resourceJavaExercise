package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

//29. Write a Java program to convert a string to date.
public class DateTime_29 {
    private LocalDate localDate;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a date(eg: May 1, 2016): ");
        localDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH));
    }

    private void printDate() {
        System.out.println(localDate);
    }

    private void init(){
        input();
        printDate();
    }

    public static void main(String[] args) {
        new DateTime_29().init();
    }
}
