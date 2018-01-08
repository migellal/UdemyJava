package pl.michalgellert.udemy.solutions;

public class ConditionalStatements {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i == 999) {
                System.out.print(i);
            } else if (i % 3 == 0 || i % 7 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
