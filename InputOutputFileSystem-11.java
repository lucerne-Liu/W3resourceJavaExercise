package InputOutputFileSystem;

import java.io.*;

//11. Write a Java program to read a file content line by line.
public class InputOutputFileSystem_11 {
    private static final String filePath = "F:\\study\\test.txt";
    private File file;

    public InputOutputFileSystem_11() {
        file = new File(filePath);
    }

    private void readFileByLines() {
        BufferedReader bufferedReader = null;
        String lines;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                System.out.println(lines);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_11().readFileByLines();
    }

}
