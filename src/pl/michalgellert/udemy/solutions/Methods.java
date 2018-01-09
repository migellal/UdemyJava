package pl.michalgellert.udemy.solutions;

public class Methods {
    public static void main(String[] args) {
        System.out.println(checkPrime(2));
    }

    private static boolean checkPrime(int n) {
        boolean isPrime = true;
        int counter = n-1;
        for(; counter>1; counter--) {
            if(n%counter==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
