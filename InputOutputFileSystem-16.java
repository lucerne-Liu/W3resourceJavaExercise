package InputOutputFileSystem;

import sun.awt.windows.ThemeReader;

import java.io.*;

//16. Write a Java program to append text to an existing file.
public class InputOutputFileSystem_16 {
    private static final String FILE_PATH = "F:\\study\\test.txt";
    private static String inputText;
    private File file;

    public InputOutputFileSystem_16() {
        file = new File(FILE_PATH);
    }

    private void readInput(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a line of text to be appended in the file: ");
        try {
            inputText = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void writeAndReadFile() {
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        String lines;
        try {
            //字节写入文件末尾处
            fileWriter = new FileWriter(file,true);
            fileWriter.write(System.lineSeparator());
            fileWriter.write(inputText);
            fileWriter.close();
            bufferedReader = new BufferedReader(new FileReader(file));
            System.out.println("After appending, the file content is:");
            while ((lines = bufferedReader.readLine()) != null) {
                System.out.println(lines);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    private void init() {
        readInput();
        writeAndReadFile();
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_16().init();
    }
}
