package Numbers;

import java.util.stream.Stream;

//7. Write a Java program to display first 10 lucus numbers.
//        The Lucas numbers or series are an integer sequence named after the mathematician François Édouard Anatole Lucas,
// who studied both that sequence and the closely related Fibonacci numbers.
// Lucas numbers and Fibonacci numbers form complementary instances of Lucas sequences.
//        The sequence of Lucas numbers is: 2, 1, 3, 4, 7, 11, 18, 29, ….
//        Expected Output :
//
//        First ten Lucas a numbers:
//        2
//        1
//        3
//        4
//        7
//        11
//        18
//        29
//        47
//        76
public class Numbers_7 {
    private int getLucasNumber(int num) {
        if (num == 0) {
            return 2;
        }
        if (num == 1) {
            return 1;
        }
        return getLucasNumber(num - 1) + getLucasNumber(num - 2);
    }

    private void printFirst10LucasNumbers() {
        System.out.println("First ten Lucas a numbers:");
        Stream.iterate(0, n -> n + 1).map(item -> getLucasNumber(item)).limit(10).forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Numbers_7().printFirst10LucasNumbers();
    }
}
