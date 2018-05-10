package Numbers;

import java.util.Scanner;

//3. Write a Java program to generate random integers in a specific range.
public class Numbers_3 {
    private int startRange;
    private int endRange;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the starting number of the range: ");
        startRange = scanner.nextInt();
        while (true) {
            System.out.print("Input the ending number of the range: ");
            endRange = scanner.nextInt();
            if (endRange > startRange) {
                break;
            } else {
                System.out.println("Ending number must be greater than starting number!");
            }
        }
    }

    private int getRandomWithinRange() {
        return (int) (startRange + Math.random() * (endRange - startRange + 1));
    }

    private void pringRandomNum() {
        System.out.printf("The random integer between %d and %d is: %d\n", startRange, endRange, getRandomWithinRange());
    }

    private void init() {
        input();
        pringRandomNum();
    }

    public static void main(String[] args) {
        new Numbers_3().init();
    }
}
