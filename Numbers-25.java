package Numbers;

import java.util.stream.Stream;

//25. Write a Java program to print the first 15 numbers of the Pell series.
//        In mathematics, the Pell numbers are an infinite sequence of integers.
// The sequence of Pell numbers starts with 0 and 1, and then each Pell number is the sum of twice the previous Pell number
// and the Pell number before that.:
//        thus, 70 is the companion to 29, and 70 = 2 × 29 + 12 = 58 + 12.
//        The first few terms of the sequence are :
//        0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…
//
//        Expected Output
//        First 20 Pell numbers:
//        1 2 5 12 29 70 169 408 985 2378 5741 13860 33461 80782 195025 470832 113
//        6689 2744210 6625109 15994428
public class Numbers_25 {
    private static final int MAX_BOUNDARY = 20;

    private int getPellNumber(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return 2 * getPellNumber(num - 1) + getPellNumber(num - 2);
    }

    private void printPellNumbers() {
        System.out.println("First 20 Pell numbers:");
        Stream.iterate(1, n -> n + 1).map(this::getPellNumber).limit(MAX_BOUNDARY).forEach(item -> System.out.print(item + " "));
    }

    public static void main(String[] args) {
        new Numbers_25().printPellNumbers();
    }
}
