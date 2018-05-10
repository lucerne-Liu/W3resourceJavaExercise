package DateTime;

//37. Write a Java program to find seconds since 1970.
public class DateTime_37 {
    private void printSecondsSince1970() {
        System.out.println("Seconds since 1970: " + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        new DateTime_37().printSecondsSince1970();
    }
}
