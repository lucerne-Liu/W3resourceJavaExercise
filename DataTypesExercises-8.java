package DataTypesExercises;

import java.util.Scanner;

//8. Write a Java program that reads a number and display the square, cube, and fourth power.
//
//        Expected Output:
//        Square: .2f
//        Cube: .2f
//        Fourth power: 50625.00
public class DataTypesExercises_8 {
    private static final Integer SQUARE = 2;
    private static final Integer CUBE = 3;
    private static final Integer FOURTH_POWER = 4;
    private float inputNum;

    private void input() {
        System.out.print("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextFloat();
    }

    private double getGivenPowerOfNum(int powerNumber) {
        return Math.pow(inputNum, powerNumber);
    }

    private void printResult(String powerType, int powerNumber) {
        System.out.println(String.format("%s: %.2f", powerType, getGivenPowerOfNum(powerNumber)));
    }

    private void init() {
        input();
        printResult("Square",SQUARE);
        printResult("Cube",CUBE);
        printResult("Fourth power",FOURTH_POWER);
    }

    public static void main(String[] args) {
        new DataTypesExercises_8().init();
    }

}
