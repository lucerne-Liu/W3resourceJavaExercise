package DataTypesExercises;

//    3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
//    Test Data
//    Input an integer between 0 and 1000: 565
//    Expected Output :
//    The sum of all digits in 565 is 16

import java.util.Arrays;
import java.util.Scanner;

public class DataTypesExercises_3 {
    private int inputNum;

    private void input(){
        System.out.print("Input an integer between 0 and 1000: ");
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        if (!validateInput()){
            System.out.println("Input illegal!");
            input();
        }
    }

    private boolean validateInput(){
        return inputNum >= 0 && inputNum <= 1000;
    }

    private int getDigitsSumOfNum(){
        return Arrays.stream(String.valueOf(inputNum).split("")).mapToInt(Integer::valueOf).sum();
    }

    private void printResult(){
        System.out.println(String.format("The sum of all digits in %d is %d", inputNum, getDigitsSumOfNum()));
    }

    private void init(){
        input();
        printResult();
    }

    public static void main(String[] args) {
        new DataTypesExercises_3().init();
    }
}
