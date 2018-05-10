package InputOutputFileSystem;

import java.io.File;

//5. Write a Java program to check if given pathname is a directory or a file.
public class InputOutputFileSystem_5 {
    private static final String filePath = "D:\\IdeaProjects\\employees.zip";
    private File file;

    public InputOutputFileSystem_5() {
        file = new File(filePath);
    }

    private void printWhetherIsDirectoryOrFile() {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + " is a file.");
        }else{
            System.out.println(file.getAbsolutePath() + " is not a file.");
        }
        if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath() + " is a directory.");
        }else{
            System.out.println(file.getAbsolutePath() + " is not a directory.");
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_5().printWhetherIsDirectoryOrFile();
    }
}
