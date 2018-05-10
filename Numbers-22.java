package Numbers;

import java.util.Scanner;

//22. Write a program to check if a number is Mersenne number or not.
//        In mathematics, a Mersenne number is a prime number that can be written in the form Mn = 2n − 1 for some integer n.
//        The first four Mersenne primes are 3, 7, 31, and 127
//
//        Expected Output
//        Input a number: 127
//        127 is a Mersenne number.
public class Numbers_22 {
    private int inputNumber;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
        if (!validateInputIsPrime()) {
            System.out.println("Input should be prime number!");
            input();
        }
    }

    private boolean validateInputIsPrime() {
        boolean flag = true;
        for (int j = 2; j <= Math.sqrt(inputNumber); j++) {
            if (inputNumber % j == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isMersenneNumber() {
        for (int i = 0; ; i++) {
            int power = (int) Math.pow(2, i);
            if (power > inputNumber + 1) {
                return false;
            }
            if (power == inputNumber + 1) {
                return true;
            }
        }
    }

    private void print() {
        System.out.printf("%s is %sa Mersenne number.", inputNumber, isMersenneNumber() ? "" : "not ");
    }

    private void init() {
        input();
        print();
    }

    public static void main(String[] args) {
        new Numbers_22().init();
    }
}
