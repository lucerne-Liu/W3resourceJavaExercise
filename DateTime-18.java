package DateTime;

import java.util.Scanner;

//18. Write a Java program to check a year is a leap year or not.
public class DateTime_18 {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a year: ");
        year = scanner.nextInt();
    }

    public boolean checkIsLeapYear() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private void printResult() {
        System.out.printf("Year %d is %sa leap year",year,checkIsLeapYear() ? "" : "not ");
    }

    private void init(){
        input();
        printResult();
    }

    public static void main(String[] args) {
        new DateTime_18().init();
    }
}
