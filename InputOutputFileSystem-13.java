package InputOutputFileSystem;

import java.io.*;

//13. Write a java program to read a file line by line and store it into a variable.
public class InputOutputFileSystem_13 {
    private static final String filePath = "F:\\study\\test.txt";
    private File file;

    public InputOutputFileSystem_13() {
        file = new File(filePath);
    }

    private void readFileIntoVariable() {
        BufferedReader bufferedReader = null;
        StringBuilder content = new StringBuilder();
        String lines;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                content.append(lines);

            }
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Unable to close the file.");
            }
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_13().readFileIntoVariable();
    }
}
