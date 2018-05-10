package Numbers;

import java.util.stream.Stream;

//28. Write a Java program to create the first twenty Hamming numbers.
//        In computer science, regular numbers are often called Hamming numbers,
//        Hamming Numbers are numbers whose only prime factors are 2, 3 and 5.
//        The first few hamming numbers are :
//        1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25, 27, 30, 32
//
//        Expected Output
//        First Twenty Hamming numbers: 1 2 3 4 5 6 8 9 10 12 15 16 18 20 24 25 27
//        30 32 36
//https://www.w3resource.com/java-exercises/numbers/java-number-exercise-28.php
public class Numbers_28 {
    private final static int MAX_BODUNDARY = 20;
    private boolean isHammingNumber(int num) {
        if (num == 1) {
            return true;
        }
        if (num % 2 == 0) {
            return isHammingNumber(num / 2);
        }
        if (num % 3 == 0) {
            return isHammingNumber(num / 3);
        }
        if (num % 5 == 0) {
            return isHammingNumber(num / 5);
        }
        return false;
    }

    private void printammingNumbers() {
        System.out.print("First Twenty Hamming numbers: ");
        Stream.iterate(1, n -> n + 1).filter(item -> isHammingNumber(item)).limit(MAX_BODUNDARY).forEach(item -> {
            System.out.print(item + " ");
        });
    }

    public static void main(String[] args) {
        new Numbers_28().printammingNumbers();
    }
}
