package DataTypesExercises;

import java.util.Scanner;

//6. Write a Java program to compute body mass index (BMI).
//
//        Test Data
//        Input weight in pounds: 452
//        Input height in inches: 72
//        Expected Output:
//        Body Mass Index is 61.30159143458721
public class DataTypesExercises_6 {
    private double pounds;
    private double inches;

    private void input() {
        System.out.print("Input weight in pounds: ");
        Scanner scanner = new Scanner(System.in);
        pounds = scanner.nextDouble();
        System.out.print("Input height in inches: ");
        inches = scanner.nextDouble();
    }

    private double getBodyMassIndex() {
        return (pounds * 0.4535924) / Math.pow(inches * 0.0254, 2);
    }

    private void printResult() {
        System.out.println(String.format("Body Mass Index is %.14f", getBodyMassIndex()));
    }

    private void init() {
        input();
        printResult();
    }

    public static void main(String[] args) {
        new DataTypesExercises_6().init();
    }
}
