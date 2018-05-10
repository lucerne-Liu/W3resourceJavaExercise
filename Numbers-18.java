package Numbers;

import java.util.Scanner;

//18. Write a Java program to check a number is a cube or not.
//        In arithmetic and algebra, the cube of a number n is its third power:
// the result of the number multiplied by itself twice:
//        n3 = n × n × n.
//        Input Data:
//        Input a number: 8
//        Expected Output
//
//        Number is a cube.
public class Numbers_18 {
    private int inputNumber;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isCube() {
        int cubeRoot = (int) Math.round(Math.pow(inputNumber, 1.0 / 3.0));
        return inputNumber == (int) Math.pow(cubeRoot, 3);
    }

    private void print() {
        System.out.println("Number is " + (isCube() ? "" : "not ") + "a cube.");
    }

    private void init() {
        input();
        print();
    }

    public static void main(String[] args) {
        new Numbers_18().init();
    }
}
