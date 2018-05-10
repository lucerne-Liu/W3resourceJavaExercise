package Numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

//9. Write a Java program to find and print the first 10 happy numbers.
//        Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits,
// and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
//        Example: 19 is a happy number
//        1^2 + 9^2=82
//        8^2 + 2^2=68
//        6^2 + 8^2=100
//        1^2 + 0^2 + 0^2=1
//
//        Expected Output
//
//        First 10 Happy numbers:
//        1
//        7
//        10
//        13
//        19
//        23
//        28
//        31
public class Numbers_9 {
    private Set<Long> cycle = new HashSet<Long>();
    private Double getSumOfDigits(int num) {
        String number = String.valueOf(num);
        return Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), 2)).reduce((x, y) -> x + y).get();
    }

    private boolean isHappyNumber(int num) {
        if (num == 1){
            return true;
        }
        if (num == 4) {
            return false;
        }
        return isHappyNumber(getSumOfDigits(num).intValue());
    }

    private void printFirst10HappyNumbers() {
        System.out.println("First 10 Happy numbers:");
        Stream.iterate(1, n -> n + 1).filter(this::isHappyNumber).limit(10).forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Numbers_9().printFirst10HappyNumbers();
    }
}
