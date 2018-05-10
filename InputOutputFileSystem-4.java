package InputOutputFileSystem;

import java.io.File;

//4. Write a Java program to check if a file or directory has read and write permission.
public class InputOutputFileSystem_4 {
    private static final String filePath = "D:\\IdeaProjects\\employees.zip";
    private File file;

    public InputOutputFileSystem_4() {
        file = new File(filePath);
    }

    private void printWhetherFileCanReadAndWrite() {
        if (file.canRead()) {
            System.out.println(file.getAbsolutePath() + " can read.");
        }else{
            System.out.println(file.getAbsolutePath() + " cannot read.");
        }
        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath() + " can write.");
        }else{
            System.out.println(file.getAbsolutePath() + " cannot write.");
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_4().printWhetherFileCanReadAndWrite();
    }
}
