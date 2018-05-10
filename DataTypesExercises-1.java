package DataTypesExercises;

import java.util.Scanner;

//    1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//    Test Data
//    Input a degree in Fahrenheit: 212
//    Expected Output:
//            212.0 degree Fahrenheit is equal to 100.0 in Celsius

public class DataTypesExercises_1 {
    private Double fahrenheit;

    private void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
    }

    private Double convertFahrenheitToCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }

    private void printTemperatureConversionResult() {
        System.out.println(String.format("%.1f degree Fahrenheit is equal to %.1f in Celsius", fahrenheit, convertFahrenheitToCelsius()));
    }

    private void init(){
        input();
        printTemperatureConversionResult();
    }

    public static void main(String[] args) {
        new DataTypesExercises_1().init();
    }

}
