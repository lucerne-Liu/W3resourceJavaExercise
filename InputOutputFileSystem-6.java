package InputOutputFileSystem;

import java.io.File;

//6. Write a Java program to compare two files lexicographically.
//        According to Wikipedia:
//        In mathematics, the lexicographic or lexicographical order
//        (also known as lexical order, dictionary order, alphabetical order or lexicographic(al) product)
//        is a generalization of the way the alphabetical order of words is based on the alphabetical order of their component letters.
//        This generalization consists primarily in defining a total order over the sequences
//        (often called words in computer science) of elements of a finite totally ordered set, often called alphabet.
public class InputOutputFileSystem_6 {
    private static final String filePath1 = "D:\\IdeaProjects\\employees.zip";
    private static final String filePath2 = "D:\\IdeaProjects\\hellotwu.zip";
    private static final String filePath3 = "D:\\IdeaProjects\\employees.zip";
    private File file1;
    private File file2;
    private File file3;

    public InputOutputFileSystem_6() {
        file1 = new File(filePath1);
        file2 = new File(filePath2);
        file3 = new File(filePath3);
    }

    private void printComparisonResult() {
        System.out.printf("'%s'  %s  '%s'%n",file1.getAbsolutePath(),getCompareResult(file1, file2),file2.getAbsolutePath());
        System.out.printf("'%s'  %s  '%s'%n",file1.getAbsolutePath(),getCompareResult(file1, file3),file3.getAbsolutePath());
    }

    private String getCompareResult(File file1, File file2) {
        if (file1.compareTo(file2) == 0){
            return "=";
        }
        if (file1.compareTo(file2) > 0){
            return "<";
        }
        return ">";
    }

    public static void main(String[] args) {
        new InputOutputFileSystem_6().printComparisonResult();
    }
}
