package DateTime;


//30. Write a Java program to compute the difference between two dates (year, months, days).
public class DateTime_30 extends DateTime_19{

    private void printDifferenceBetweenDates() {
        System.out.printf("Difference is %d years, %d months and %d days old",
                getPeriodBetween().getYears(), getPeriodBetween().getMonths(), getPeriodBetween().getDays());
    }

    private void init(){
        input();
        printDifferenceBetweenDates();
    }

    public static void main(String[] args) {
        new DateTime_30().init();
    }
}
