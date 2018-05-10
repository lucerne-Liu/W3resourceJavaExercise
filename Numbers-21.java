package Numbers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//21. Write java program to find any number between 1 and n that can be expressed as the sum of two cubes in two (or more) different ways.
////http://introcs.cs.princeton.edu/java/13flow/Ramanujan.java.html
//        Here are some examples of Ramanujan numbers :
//        1729 = 1^3 + 12^3 = 9^3 + 10^3
//        * 10000
//        1729 = 1^3 + 12^3 = 9^3 + 10^3
//        4104 = 2^3 + 16^3 = 9^3 + 15^3
//        * 100000
//        1729 = 1^3 + 12^3 = 9^3 + 10^3
//        4104 = 2^3 + 16^3 = 9^3 + 15^3
//        13832 = 2^3 + 24^3 = 18^3 + 20^3
//        39312 = 2^3 + 34^3 = 15^3 + 33^3
//        46683 = 3^3 + 36^3 = 27^3 + 30^3
//        32832 = 4^3 + 32^3 = 18^3 + 30^3
//        40033 = 9^3 + 34^3 = 16^3 + 33^3
//        20683 = 10^3 + 27^3 = 19^3 + 24^3
//        65728 = 12^3 + 40^3 = 31^3 + 33^3
//        64232 = 17^3 + 39^3 = 26^3 + 36^3
//
//        Expected Output
//        1729 = 1^3 + 12^3 = 9^3 + 10^3
//        4104 = 2^3 + 16^3 = 9^3 + 15^3
//        13832 = 2^3 + 24^3 = 18^3 + 20^3
//        39312 = 2^3 + 34^3 = 15^3 + 33^3
//        46683 = 3^3 + 36^3 = 27^3 + 30^3
//        32832 = 4^3 + 32^3 = 18^3 + 30^3
//        40033 = 9^3 + 34^3 = 16^3 + 33^3
//        20683 = 10^3 + 27^3 = 19^3 + 24^3
//        65728 = 12^3 + 40^3 = 31^3 + 33^3
//        64232 = 17^3 + 39^3 = 26^3 + 36^3
public class Numbers_21 {
    private int inputNumber;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the maximum boundary value of Ramanujan numbers: ");
        inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Value should be positive!");
            input();
        }
    }

    private List<Integer> getCubesOfRamanujanNumbers(int num) {
        int count = 0;
        List<Integer> cubeArrList = new ArrayList<>();
        for (int i = 1; i < Math.floor(Math.pow(num, 1.0 / 3.0)); i++) {
            //n = a^3 + b^3
            double b = Math.round(Math.pow(num - Math.pow(i, 3), 1.0 / 3.0));
            if (i * i * i + b * b * b == num && !cubeArrList.contains(i)) {
                count++;
                cubeArrList.add(i);
                cubeArrList.add((int) b);
            }
        }
        return count > 1 ? cubeArrList : null;
    }

    private void print() {
        List<Integer> cubeArrList;
        for (int i = 1; i <= inputNumber; i++) {
            cubeArrList = getCubesOfRamanujanNumbers(i);
            if (cubeArrList != null) {
                System.out.printf("%d = %d^3 + %d^3 = %d^3 + %d^3%n", i, cubeArrList.get(0), cubeArrList.get(1), cubeArrList.get(2), cubeArrList.get(3));
            }
        }
    }

    private void init() {
        input();
        print();
    }

    public static void main(String[] args) {
        new Numbers_21().init();
    }
}
