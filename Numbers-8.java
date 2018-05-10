package Numbers;


//8.Write a Java program to print out the first 10 Catalan numbers by extracting them from Pascal's triangle.
//        In combinatorial mathematics, the Catalan numbers form a sequence of natural numbers
// that occur in various counting problems, often involving recursively-defined objects.
// They are named after the Belgian mathematician Eugène Charles Catalan.
//        The first Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796, 58786, 208012, 742900, 2674440, 9694845, 35357670, 129644790, 477638700, 1767263190, 6564120420, 24466267020, 91482563640, 343059613650, 1289904147324, 4861946401452,
//
//        List 10 Catalan numbers:-
//
//        1
//        2
//        5
//        14
//        42
//        132
//        429
//        1430
//        4862
//        16796
public class Numbers_8 {
    private static final int MAX_LENGTH = 11;
    private int[] Catalan = new int[MAX_LENGTH];

    private void printCatalanNumber() {
        Catalan[0] = 1;
        for (int i = 1; i < MAX_LENGTH; i++) {
            Catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                Catalan[i] += (Catalan[j] * Catalan[i - 1 - j]);
            }
            System.out.println(Catalan[i]);
        }
    }

    public static void main(String[] args) {
        new Numbers_8().printCatalanNumber();
    }

}
