package Numbers;

import java.util.Scanner;

//14. Write a Java program check whether a number is an Automorphic number or not.
//        In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself.
// For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625, so 5, 6, 76 and 890625 are all automorphic numbers.
//        Expected Output
//
//        Input a number : 76
//        Automorphic Number.
public class Numbers_14 {
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

    private boolean isAutomorphicNumber() {
        return String.valueOf(inputNumber * inputNumber).endsWith(Integer.toString(inputNumber));
    }

    private void init() {
        input();
        System.out.printf("%sAutomorphic Number.\n", isAutomorphicNumber() ? "" : "Not an ");
    }

    public static void main(String[] args) {
        new Numbers_14().init();
    }
}
