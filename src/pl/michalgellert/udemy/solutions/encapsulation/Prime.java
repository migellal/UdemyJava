package pl.michalgellert.udemy.solutions.encapsulation;

import pl.michalgellert.udemy.utils.StrUtils;

public class Prime {

    public String listOfPrimes(int x, int y) {
        String separator = ", ";
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("");
        for(; x<=y; x++) {
            if(isPrime(x)) {
                resultBuilder.append(x);
                resultBuilder.append(separator);
            }
        }
        String result = resultBuilder.toString();
        return StrUtils.removeLastSeparator(result, separator);
    }

    private boolean isPrime(int n) {
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
