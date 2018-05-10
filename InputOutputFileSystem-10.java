package InputOutputFileSystem;

import java.io.*;

//10. Write a Java program to read contents from a file into byte array.
public class InputOutputFileSystem_10 {
    private static final String filePath = "F:\\study\\test.txt";
    private File file;

    public InputOutputFileSystem_10() {
        file = new File(filePath);
    }

    private void readFile() {
        InputStream inputStream = null;
        byte[] text = new byte[2 * 1024];
        try {
            inputStream = new FileInputStream(file);
            int readCount = 0;
            while ((readCount = inputStream.read(text)) > 0) {
                System.out.println(new String(text, 0, readCount - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_10().readFile();
    }
}
