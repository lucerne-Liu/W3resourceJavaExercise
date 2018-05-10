package Numbers;


import java.util.*;
import java.util.stream.Collectors;

//17. Write a Java program to check if a given number is circular prime or not.
//        Circular Prime : A circular prime is a prime number with the property
// that the number generated at each intermediate step when cyclically permuting its (base 10) digits will be prime.
//        For example, 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime.
// A circular prime with at least two digits can only consist of combinations of the digits 1, 3, 7 or 9,
// because having 0, 2, 4, 6 or 8 as the last digit makes the number divisible by 2,
// and having 0 or 5 as the last digit makes it divisible by 5.
//        Input Data:
//        Input a number: 35
//        Expected Output
//
//        It is not a Circular Prime number.
public class Numbers_17 {
    private final static List<Integer> NON_PRIME_ENDS = Arrays.asList(0, 2, 4, 6, 8, 5);
    private int inputNumber;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isPrime(int num) {
        if (NON_PRIME_ENDS.contains(num % 10) || String.valueOf(num).length() < 2){
            return false;
        }
        boolean flag = true;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    private int getRotateNumberWithGivenDistance(int distance) {
        List<String> numList = Arrays.stream(String.valueOf(inputNumber).split("")).collect(Collectors.toList());
        Collections.rotate(numList, distance);
        return Integer.parseInt(numList.stream().reduce("", String::concat));
    }

    private boolean isCircularPrime() {
        for (int i = 0; i < String.valueOf(inputNumber).length(); i++) {
            if (!isPrime(getRotateNumberWithGivenDistance(i))) {
                return false;
            }
        }
        return true;
    }

    private void init() {
        input();
        System.out.println("It is "+ (isCircularPrime() ? "" : "not ") + "a Circular Prime number.");
    }

    public static void main(String[] args) {
        new Numbers_17().init();
    }
}
