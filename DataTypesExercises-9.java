package DataTypesExercises;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

//9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product,
// the average, the distance (the difference between integer), the maximum (the larger of the two integers),
// the minimum (smaller of the two integers).r
//
//        Test Data
//        Input 1st integer: 25
//        Input 2nd integer: 5
//        Expected Output :
//        Sum of two integers: 30
//        Difference of two integers: 20
//        Product of two integers: 125
//        Average of two integers: 15.00
//        Distance of two integers: 20
//        Max integer: 25
//        Min integer: 5
public class DataTypesExercises_9 {
    private int firstNum;
    private int secondNum;

    private void input() {
        System.out.print("Input 1st integer: ");
        Scanner scanner = new Scanner(System.in);
        firstNum = scanner.nextInt();
        System.out.print("Input 2nd integer: ");
        secondNum = scanner.nextInt();
    }

    private int getSum() {
        return firstNum + secondNum;
    }

    private int getDifference() {
        return Math.abs(firstNum - secondNum);
    }

    private int getProduct() {
        return firstNum * secondNum;
    }

    private double getAverage() {
        return (double) getSum() / 2;
    }

    private int getMax() {
        return Math.max(firstNum, secondNum);
    }

    private int getMin() {
        return Math.min(firstNum, secondNum);
    }

    private void printResult() {
        System.out.println("Sum of two integers: " + getSum());
        System.out.println("Difference of two integers: " + getDifference());
        System.out.println("Product of two integers: " + getProduct());
        System.out.printf("Average of two integers: %.2f%n", getAverage());
        System.out.println("Distance of two integers: " + getDifference());
        System.out.println("Max integer: " + getMax());
        System.out.println("Min integer: " + getMin());
    }

    private void init() {
        input();
        printResult();
    }

    public static void main(String[] args) {
        new DataTypesExercises_9().init();
    }
}
