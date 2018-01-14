package pl.michalgellert.udemy.exceptions;

public class Exc {

    public static void main(String[] args) {

        int x = 4;
        int y = 0;

//        if(y==0) {
//
//        }

        try {
            System.out.println((x / y));
        } catch (ArithmeticException e) {
            System.err.println("divide by zero error: " + e.getMessage());
        } catch (Exception e1) {
            System.err.println("unknown error");
        }
    }
}
