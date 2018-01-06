package pl.michalgellert.udemy.variables;

public class Table {

    public static void main(String[] args) {

        int[] ints;
        ints = new int[3];

        ints[0] = 6; // pierwszy element
        ints[1] = 3; // drugi element
        ints[2] = 765; // trzeci element

        System.out.println(ints[1]);
        // System.out.println(ints[4]);

        String strings[] = {"element", "inny element"};

        System.out.println(strings[1]);
    }
}
