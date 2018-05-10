package Numbers;

import java.util.Scanner;

//15. Write a Java program to check whether a number is a Duck Number or not.
//        Note: A Duck number is a number which has zeroes present in it,
// but there should be no zero present in the beginning of the number.
// For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.
//        Expected Output
//
//        Input a number : 3210
//        Duck number
public class Numbers_15 {
    private String inputNumber;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        inputNumber = scanner.nextLine();
        if (Integer.parseInt(inputNumber) < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isDuckNumber() {
        return inputNumber.indexOf("0") > 0;
    }

    private void init() {
        input();
        System.out.printf("%sDuck number\n", isDuckNumber() ? "" : "Not a ");
    }

    public static void main(String[] args) {
        new Numbers_15().init();
    }

}
