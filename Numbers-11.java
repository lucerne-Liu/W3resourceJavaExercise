package Numbers;

import java.util.Arrays;
import java.util.Scanner;

//11. Write a Java program to check whether a given number is a Disarium number or unhappy number.
//        A Disarium number is a number defined by the following process :
//        Sum of its digits powered with their respective position is equal to the original number.
//        For example 175 is a Disarium number :
//        As 1^1+3^2+5^3 = 135
//        Some other DISARIUM are 89, 175, 518 etc.
//        A number will be called Disarium if the sum of its digits powered with their respective position is equal with the number itself.
// Sample Input: 135.
//        Expected Output
//
//        Input a number : 25
//        Not a Disarium Number.
public class Numbers_11 {
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

    private boolean isDisariumNumber(int num) {
        String number = String.valueOf(num);
        return num == Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), number.indexOf(item) + 1)).reduce((x, y) -> x + y).get();
    }

    private void init() {
        input();
        System.out.printf("%sDisarium Number\n", isDisariumNumber(inputNumber) ? "" : "Not a ");
    }

    public static void main(String[] args) {
        new Numbers_11().init();
    }
}
