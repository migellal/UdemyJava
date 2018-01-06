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

        // multidimensional array

        String[][] strings2 = {{"q", "w", "e"}, {"a"},
                {"element", "inny element", "element", "inny element", "element", "inny element"}};

        System.out.println(strings2[0][2]);

        int[][][] ints3 = new int[][][]{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        int[][] ints2 = ints3[0];
        System.out.println(ints2[0][0]);

    }
}
