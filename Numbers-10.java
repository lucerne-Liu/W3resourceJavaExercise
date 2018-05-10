package Numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//10. Write a Java program to check whether a given number is a happy number or unhappy number.
//        Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits,
// and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
//        An unhappy number is a number that is not happy.
//        The first few unhappy numbers are 2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 18, 20.
//
//        Expected Output
//
//        Input a number: 5
//        Unhappy Number
public class Numbers_10 {
    private int inputNumber;
    private Set<Long> cycle = new HashSet<Long>();

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }
    private boolean isHappyNumber(int num) {
        if (num == 1){
            return true;
        }
        if (!cycle.add((long) num)) {
            return false;
        }
        return isHappyNumber(getSumOfDigits(num).intValue());
    }

    private Double getSumOfDigits(int num) {
        String number = String.valueOf(num);
        return Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), 2)).reduce((x, y) -> x + y).get();
    }

    private void init() {
        input();
        System.out.printf("%s Number\n", isHappyNumber(inputNumber) ? "Happy" : "Unhappy");
    }

    public static void main(String[] args) {
        new Numbers_10().init();
    }
}
