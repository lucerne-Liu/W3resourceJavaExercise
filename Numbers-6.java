package Numbers;

import java.util.Arrays;
import java.util.stream.Stream;

//6. Write a Java program to generate and show the first 15 narcissistic decimal numbers.
//        Expected Output :
//
//        0 1 2 3 4 5 6 7 8 9 153 370 371 407 1634
public class Numbers_6 {
    private boolean isNarcissisticDecimalNumbers(int num) {
        String number = String.valueOf(num);
        return num == Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), number.length())).reduce((x, y) -> x + y).get();
    }

    private void printFirst15Narcissistic() {
        Stream.iterate(0, n -> n + 1).filter(item -> isNarcissisticDecimalNumbers(item)).limit(15).forEach(item -> {
            System.out.print(item + " ");
        });
    }

    public static void main(String[] args) {
        new Numbers_6().printFirst15Narcissistic();
    }
}
