package Numbers;

import java.util.Arrays;
import java.util.Scanner;

//12. Write a Java program to check whether a number is a Harshad Number or not.
//        In recreational mathematics, a harshad number in a given number base,
// is an integer that is divisible by the sum of its digits when written in that base.
//        Example:
// Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2.
// Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
//        Expected Output
//
//        Input a number : 353
//
//        353 is not a Harshad Number.
public class Numbers_12 {
    private int inputNumber;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isHarshadNumber() {
        String number = String.valueOf(inputNumber);
        return inputNumber % Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum() == 0;
    }

    private void init() {
        input();
        System.out.printf("%s is %sa Harshad Number.\n", inputNumber,isHarshadNumber() ? "" : "not ");
    }

    public static void main(String[] args) {
        new Numbers_12().init();
    }
}
