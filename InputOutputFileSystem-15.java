package InputOutputFileSystem;

import java.io.*;

//15. Write a Java program to write and read a plain text file.
public class InputOutputFileSystem_15 {
    private static final String FILE_PATH = "F:\\study\\test.txt";
    private static String APPEND_TEXT = "This is a new line!";
    private File file;

    public InputOutputFileSystem_15() {
        file = new File(FILE_PATH);
    }

    private void write() {
        try {
            //字节写入文件末尾处
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(APPEND_TEXT);
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    private void read() {
        BufferedReader bufferedReader = null;
        String lines;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                System.out.println(lines);

            }
        } catch (IOException e) {
           System.err.println("IOException: " + e.getMessage());
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("IOException: " + e.getMessage());
            }
        }
    }

    private void init() {
        write();
        read();
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_15().init();
    }
}
