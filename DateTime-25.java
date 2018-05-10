package DateTime;

import java.time.Year;

//25. Write a Java program to get the information of current/given year. Go to the editor
//
//        Sample format :
//
//        Sample Output :
//        Current Year: 2001
//        Is current year leap year? false
//        Length of the year: 365 days
public class DateTime_25 extends DateTime_18{

    public DateTime_25() {
        super();
        setYear(Year.now().getValue());
    }

    private int getLengthOfYear() {
        return checkIsLeapYear() ? 366 : 365;
    }

    private void printInformation() {
        System.out.println("Current Year: " + getYear());
        System.out.println("Is current year leap year? " + checkIsLeapYear());
        System.out.printf("Length of the year: %d days%n", getLengthOfYear());
    }

    private void init() {
        printInformation();
        input();
        printInformation();
    }

    public static void main(String[] args) {
        new DateTime_25().init();

//        //Current year
//        Year yr = Year.now();
//        //given year
//        //Year yr = Year.of(2001);
//        System.out.println("\nCurrent Year: " + yr);
//        boolean isLeap = yr.isLeap(); // false
//        System.out.println("Is current year leap year? " + isLeap);
//        int length = yr.length(); // 365
//        System.out.println("Length of the year: " + length+" days\n");
    }

}
