package InputOutputFileSystem;

import java.io.File;
import java.util.Date;

//7. Write a Java program to get last modified time of a file.
public class InputOutputFileSystem_7 {
    private static final String filePath = "D:\\IdeaProjects\\employees.zip";
    private File file;

    public InputOutputFileSystem_7() {
        file = new File(filePath);
    }

    private void printLastModifiedTime() {
        if (file.exists()) {
            Date date = new Date(file.lastModified());
            System.out.println("The file was last modified on: " + date);
        } else {
            System.out.println("The file does not exist!");
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_7().printLastModifiedTime();
    }
}
