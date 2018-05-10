package InputOutputFileSystem;

import java.io.File;

//2. Write a Java program to get specific files by extensions from a specified folder.
public class InputOutputFileSystem_2 {
    private static final String filePath = "D:\\IdeaProjects";
    private static final String PREFIX = ".zip";
    private File file;

    public InputOutputFileSystem_2() {
        file = new File(filePath);
    }

    private void printFileNamwWithGivenSuffix() {
        String[] fileList = file.list((dir, name) -> name.toLowerCase().endsWith(PREFIX));
        for (String fileName : fileList) {
            System.out.println(fileName);
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_2().printFileNamwWithGivenSuffix();
    }
}
