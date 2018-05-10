package InputOutputFileSystem;

import java.io.*;

//12. Write a Java program to read a plain text file.
public class InputOutputFileSystem_12 {
    private static final String filePath = "F:\\study\\test.txt";
    private File file;

    public InputOutputFileSystem_12() {
        file = new File(filePath);
    }

    private void readFile() {
        BufferedReader bufferedReader = null;
        StringBuffer stringBuffer = new StringBuffer();
        String lines;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                stringBuffer.append(lines);
                stringBuffer.append(System.lineSeparator());

            }
            System.out.println(stringBuffer);
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
        new InputOutputFileSystem_12().readFile();
    }
}
