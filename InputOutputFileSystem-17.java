package InputOutputFileSystem;

import java.io.*;

//17. Write a Java program to read first 3 lines from a file.
public class InputOutputFileSystem_17 {
    private static final String filePath = "F:\\study\\test.txt";
    private File file;

    public InputOutputFileSystem_17() {
        file = new File(filePath);
    }

    private void readFirst3LinesInFile() {
        LineNumberReader lineNumberReader = null;
        String lines;
        try {
            lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(file)));
            while ((lines = lineNumberReader.readLine()) != null && lineNumberReader.getLineNumber() <= 3) {
                System.out.println(lines);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert lineNumberReader != null;
                lineNumberReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_17().readFirst3LinesInFile();
    }
}
