package InputOutputFileSystem;

import java.io.File;

//1. Write a Java program to get a list of all file/directory names from the given.
public class InputOutputFileSystem_1 {
    private static final String filePath = "D:\\IdeaProjects";
    private File file;

    public InputOutputFileSystem_1() {
        file = new File(filePath);
    }

    private void printFileList() {
        String[] fileList = file.list();
        for (String fileName : fileList) {
            System.out.println(fileName);
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_1().printFileList();
    }
}
