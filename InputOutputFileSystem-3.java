package InputOutputFileSystem;

import java.io.File;

//3. Write a Java program to check if a file or directory specified by pathname exists or not.
public class InputOutputFileSystem_3 {
    private static final String filePath = "D:\\IdeaProjects\\employees_121.zip";
    private File file;

    public InputOutputFileSystem_3() {
        file = new File(filePath);
    }

    private void printWhetherFileIsExist() {
        if (file.exists()) {
            System.out.println("The directory or file exists.");
        }else{
            System.out.println("The directory or file does not exist.");
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_3().printWhetherFileIsExist();
    }
}
