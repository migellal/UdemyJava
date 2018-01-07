package pl.michalgellert.udemy.loops;

public class Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) { // for(int i = 1; i<=30; i++)
            System.out.println("nr# " + i);
        }

//        for(;;) {
//            System.out.println("p");
//        }

        int l = 20;
        for (; l > 10; l--) {
            System.out.println(l);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " - ");
            for (int j = 0; j < 10; j++) {
                System.out.print(j + ", ");
            }
            System.out.println("");
        }

        int[] ints = {4, 3, 65, 123, 2, 90, 15};

        for(int i = 0; i<ints.length; i++) {
            System.out.println(ints[i]);
        }

        // ----- foreach ---------

        for(int i : ints) {
            System.out.println(i);
        }

        // ---------while--------


    }
}
