package Numbers;

import java.util.Arrays;
import java.util.stream.Stream;

//23. Write a Java program to find all the narcissistic numbers between 1 and 1000.
//        In number theory, a narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits.
//        For example:
//        153 = 1^3 + 5^3 + 3^3
//
//        Expected Output
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        153
//        370
//        371
//        407
public class Numbers_23 {
    private boolean isNarcissisticDecimalNumbers(int num) {
        String number = String.valueOf(num);
        return num == Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), number.length())).reduce((x, y) -> x + y).get();
    }

    private void printNarcissistic() {
        for (int i = 1; i <= 1000; i++) {
            if (isNarcissisticDecimalNumbers(i)){
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        new Numbers_23().printNarcissistic();
    }
}
