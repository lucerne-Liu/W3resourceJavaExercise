package Numbers;

import java.util.*;
import java.util.stream.Collectors;

//26. Write a Program in Java to check whether a number is a Keith Number or not.
//        In recreational mathematics, a Keith number or repfigit number (short for repetitive Fibonacci-like digit) is a number in the following integer sequence:
//        14, 19, 28, 47, 61, 75, 197, 742, 1104, 1537, 2208, 2580, 3684, 4788, 7385, 7647, 7909, 31331, 34285, 34348, 55604, 62662, 86935, 93993, 120284, 129106, 147640, 156146, 174680, 183186, 298320, 355419, 694280, 925993,
//
//        Expected Output
//        Input a number: 75
//        Keith Number
public class Numbers_26 {
    private int inputNumber;
    private List<Integer> repfigitList = new ArrayList<>();

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isKeithNumber() {
        int len = String.valueOf(inputNumber).length(), sum = 0;
        addDigitsOfNumIntoList();
        while (sum < inputNumber) {
            sum = repfigitList.stream().skip(repfigitList.size() - len).limit(len).reduce(0, Integer::sum);
            repfigitList.add(sum);
            if (sum == inputNumber){
                return true;
            }
        }
        return false;
    }

    private void addDigitsOfNumIntoList() {
        Arrays.stream(String.valueOf(inputNumber).split("")).mapToInt(Integer::parseInt).forEach(num -> {
            repfigitList.add(num);
        });
    }

    private void print() {
        System.out.printf("%sKeith Number", isKeithNumber() ? "" : "Not a ");
    }

    private void init() {
        input();
        print();
    }

    public static void main(String[] args) {
        new Numbers_26().init();
    }
}
