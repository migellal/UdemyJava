package pl.michalgellert.udemy.solutions;

public class Loops {
    public static void main(String[] args) {
        int[] ints = {23, 43, 71, 11, 32};
        int result = 0;
        for(int i : ints) {
            result += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(result);
    }
}
