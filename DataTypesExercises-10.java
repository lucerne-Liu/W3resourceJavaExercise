package DataTypesExercises;

import java.util.Arrays;
import java.util.Scanner;

//10. Write a Java program to break an integer into a sequence of individual digits.
//
//        Test Data
//        Input six non-negative digits: 123456
//        Expected Output :
//        1 2 3 4 5 6
public class DataTypesExercises_10 {
    private int number;

    private void input() {
        System.out.print("Input six non-negative digits: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
    }

    private String getSeparateDigits() {
        return Arrays.stream(String.valueOf(number).split("")).reduce((a,b) -> a +" " +b).get();
    }

    private void printResult() {
        System.out.println(getSeparateDigits());
    }

    private void init() {
        input();
        printResult();
    }

    public static void main(String[] args) {
        new DataTypesExercises_10().init();
    }
}
