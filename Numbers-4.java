package Numbers;

import java.util.OptionalInt;
import java.util.stream.IntStream;

//4. Write a Java program to generate and show all Kaprekar numbers less than 1000.
//        Expected Output :
//
//        1       1         0 + 1
//        9       81        8 + 1
//        45      2025      20 + 25
//        55      3025      30 + 25
//        99      9801      98 + 01
//        297     88209     88 + 209
//        703     494209    494 + 209
//        999     998001    998 + 001
//        8 Kaprekar numbers.
public class Numbers_4 {
    private int count = 1;

    private int getKaprekarSplitIndex(int num) {
        String squareNum = String.valueOf(num * num);
        if (squareNum.length() == 1) {
            return 0;
        }
        OptionalInt index = IntStream.range(1, squareNum.length()).filter(i -> Integer.parseInt(squareNum.substring(0, i)) + Integer.parseInt(squareNum.substring(i)) == num && Integer.parseInt(squareNum.substring(i)) != 0).findFirst();
        return index.orElse(0);
    }

    private void printKaprekarNumber() {
        for (int i = 1; i < 1000; i++) {
            if (i == 1) {
                System.out.printf("%-8d%-10d%s + %s\n", 1, 1, "0", "1");
                continue;
            }
            int index = getKaprekarSplitIndex(i);
            if (index != 0) {
                count++;
                System.out.printf("%-8d%-10d%s + %s\n", i, i * i, String.valueOf(i * i).substring(0, index), String.valueOf(i * i).substring(index));
            }
        }
        System.out.printf("%d Kaprekar numbers.\n", count);
    }

    public static void main(String[] args) {
        new Numbers_4().printKaprekarNumber();
    }
}
