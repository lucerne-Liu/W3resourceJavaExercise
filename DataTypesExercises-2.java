package DataTypesExercises;

import java.util.Scanner;

//    2. Write a Java program that reads a number in inches, converts it to meters. Go to the editor
//    Note: One inch is 0.0254 meter.
//            Test Data
//    Input a value for inch: 1000
//    Expected Output :
//            1000.0 inch is 25.4 meters
public class DataTypesExercises_2 {
    private Double inches;

    private void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        inches = scanner.nextDouble();
    }

    private Double convertInchesToMeters() {
        return inches * 0.0254;
    }

    private void printResult() {
        System.out.println(String.format("%.1f inch is %.1f meters", inches, convertInchesToMeters()));
    }

    private void init() {
        input();
        printResult();
    }

    public static void main(String[] args) {
        new DataTypesExercises_2().init();
    }

}
