package pl.michalgellert.udemy.conditionalstatements;

public class ConditionalStatements {

    public static void main(String[] args) {

        int[] ints = {2, 3, 5, 1, 4};

        for (int i : ints) {
            if (i % 2 == 0) {
                System.out.println("%2 = " + i);
            } else if (i % 3 == 0) {
                System.out.println("%3 = " + i);
//            } else if (i % 4 == 0) {
//                System.out.println("%3 = " + i);
            } else {
                System.out.println("nothing");
            }
        }

        for (int i : ints) {
            if ((i % 2 == 0 && i % 3 == 0) || i % 5 == 0) {
                System.out.println("a");
            }
        }

        for (int i : ints) {
            if (i < 3) {
                System.out.println("i<3" + i);
            } else {
                System.out.println("i>3" + i);
            }
        }
        // switch case //

        int menu = 4;
        switch (menu) {
            case 1:
                System.out.println("main menu");
                break;
            case 2:
                System.out.println("game menu");
                break;
            case 3:
                System.out.println("end menu");
                break;
            default:
                System.out.println("invalid parameter");
        }
    }
}
