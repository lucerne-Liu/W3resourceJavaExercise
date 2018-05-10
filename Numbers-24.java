package Numbers;

import java.util.Scanner;

//24. Write a Java program to check if a number is palindrome or not.
//        In number system a palindromic number is a number that is the same when written forwards or backwards, i.e., of the form .
//        The first few palindromic numbers are therefore are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, …
//
//        Expected Output
//        Input a number: 5
//        It is a Palindrome number.
public class Numbers_24 {
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

    private boolean isPalindromeNumber() {
        return new StringBuffer(String.valueOf(inputNumber)).reverse().toString().equals(String.valueOf(inputNumber));
    }

    private void print() {
        System.out.printf("%s a Palindrome number.", isPalindromeNumber() ? "It is" : "Not");
    }

    private void init() {
        input();
        print();
    }

    public static void main(String[] args) {
        new Numbers_24().init();
    }
}
