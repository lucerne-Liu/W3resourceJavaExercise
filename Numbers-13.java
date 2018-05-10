package Numbers;

import java.util.Scanner;

//13. Write a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.
//        A pronic number is a number which is the product of two consecutive integers, that is a number of the form n(n + 1).
//        The first few pronic numbers are:
//        0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
//
//        Expected Output
//        Input a number : 110
//        Pronic Number.
public class Numbers_13 {
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

    private boolean isPronicNumber() {
        for (int i = 1; i < (inputNumber + 1) / 2; i++) {
            if (i * (i+1) == inputNumber) {
                return true;
            }
        }
        return false;
    }

    private void init() {
        input();
        System.out.printf("%sPronic Number.\n", isPronicNumber() ? "" : "Not a ");
    }

    public static void main(String[] args) {
        new Numbers_13().init();
    }
}
