package InputOutputFileSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8. Write Java program to read input from java console.
public class InputOutputFileSystem_8 {
    private String input;

    private void read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a line of text: ");
        System.out.println("You input text is: " + bufferedReader.readLine());
        bufferedReader.close();;
    }

    public static void main(String[] args) throws IOException {
        new InputOutputFileSystem_8().read();
    }
}
