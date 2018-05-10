package InputOutputFileSystem;

import java.io.*;
import java.util.*;

//18. Write a Java program to find the longest word in a text file.
public class InputOutputFileSystem_18 {
    private static final String filePath = "F:\\study\\test.txt";
    private File file;

    public InputOutputFileSystem_18() {
        file = new File(filePath);
    }

    private String findLongestWordInFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String longestWord = "", currentWord;
        while (scanner.hasNext()) {
            currentWord = scanner.next();
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }
        return longestWord;
    }

    private void printLongestWord() throws FileNotFoundException {
        System.out.printf("The longest word in the file \"%s\" is: %s", file.getAbsolutePath(), findLongestWordInFile());
    }

    public static void main(String[] args) throws FileNotFoundException {
        new InputOutputFileSystem_18().printLongestWord();
    }
}
