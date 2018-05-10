package Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//16. Write a Java program to check two numbers are Amicable numbers or not.
//        Amicable numbers are two different numbers so related that the
// sum of the proper divisors of each is equal to the other number.
//        The first ten amicable pairs are: (220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), and (66928, 66992).
//        Expected Output
//
//        Input the first number: 220
//        Input the second number: 284
//        These numbers are amicable.
public class Numbers_16 {
    private int firstNumber;
    private int secondNumber;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        secondNumber = scanner.nextInt();
    }

    private boolean isAmicableNumber() {
        return getSumOfProperDivisors(firstNumber) == getSumOfProperDivisors(secondNumber);
    }

    private int getSumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private void init() {
        input();
        System.out.println("These numbers are"+ (isAmicableNumber() ? "" : " not") + " amicable.");
    }

    public static void main(String[] args) {
        new Numbers_16().init();
    }
}
