package Numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//19. Write a Java program to check a number is a cyclic or not.
//        A cyclic number is an integer in which cyclic permutations of the digits are successive multiples of the number.
// The most widely known are 142857:
//        142857 × 1 = 142857
//        142857 × 2 = 285714
//        142857 × 3 = 428571
//        142857 × 4 = 571428
//        142857 × 5 = 714285
//        142857 × 6 = 857142
//        Input Data:
//        Input a number: 142857
//        Expected Output
//
//        It is a cyclic number.
public class Numbers_19 {
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

    private int getRotateNumberWithGivenDistance(int distance) {
        List<String> numList = Arrays.stream(String.valueOf(inputNumber).split("")).collect(Collectors.toList());
        Collections.rotate(numList, distance);
        return Integer.parseInt(numList.stream().reduce("", String::concat));
    }

    private boolean isCyclicNumber() {
        for (int i = 0; i < String.valueOf(inputNumber).length(); i++) {
            if (getRotateNumberWithGivenDistance(i) % inputNumber != 0) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        System.out.println((isCyclicNumber() ? "It is" : "Not") + " a cyclic number.");
    }

    private void init() {
        input();
        print();
    }

    public static void main(String[] args) {
        new Numbers_19().init();
    }
}
