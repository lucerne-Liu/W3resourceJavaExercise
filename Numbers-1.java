package Numbers;

import java.util.Scanner;

//1. Write a Java program to check whether a given number is an ugly number.
//        In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5.
// First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
//        Test Date:Input an integer number: 235
//        Expected Output :
//        It is not an ugly number.
public class Numbers_1 {
    private int inputNum;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        inputNum = scanner.nextInt();
        if (inputNum < 0){
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isUglyNumber(int num) {
        if (num == 1) {
            return true;
        }
        if (num % 2 == 0) {
            return isUglyNumber(num / 2);
        }
        if (num % 3 == 0) {
            return isUglyNumber(num / 3);
        }
        if (num % 5 == 0) {
            return isUglyNumber(num / 5);
        }
        return false;
    }

    private void printResult() {
        System.out.printf("It is %san ugly number.", isUglyNumber(inputNum) ? "" : "not ");
    }

    private void init() {
        input();
        printResult();
    }

    public static void main(String[] args) {
        new Numbers_1().init();
    }

}
