package InputOutputFileSystem;

import java.io.File;

//9. Write a Java program to get file size in bytes, kb, mb.
public class InputOutputFileSystem_9 {
    private static final String BYTE_SIZE = " bytes";
    private static final String KB_SIZE = " kb";
    private static final String MB_SIZE = " mb";
    private static final String filePath = "D:\\IdeaProjects\\employees.zip";
    private File file;

    public InputOutputFileSystem_9() {
        file = new File(filePath);
    }

    private void printFileLength() {
        if (file.exists()) {
            System.out.println(getFileSizeWithGivenSize(BYTE_SIZE));
            System.out.println(getFileSizeWithGivenSize(KB_SIZE));
            System.out.println(getFileSizeWithGivenSize(MB_SIZE));
        } else {
            System.out.println("The file does not exist!");
        }
    }

    private String getFileSizeWithGivenSize(String size) {
        if (size.equals(BYTE_SIZE)) {
            return file.length() + BYTE_SIZE;
        }
        if (size.equals(KB_SIZE)) {
            return file.length() / (double) 1024 + KB_SIZE;
        }
        if (size.equals(MB_SIZE)) {
            return (double) file.length() / (1024 * 1024) + MB_SIZE;
        }
        return "wrong size";
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_9().printFileLength();
    }
}
