package pl.michalgellert.udemy.methods;

public class Methods {

    public static void main(String[] args) {
        sayHi();
        hi();
        hi("Karol");
        hi("Maciek", "Jacek");
        hi("Maciek", "Jacek", "Wojtek");

        System.out.println(addition(9, addition(4, 3, 2)));
        System.out.println(checkBy3(4));

        // foo();
        System.out.println(factorial(8));
    }

    private static void sayHi() {
        System.out.println("Hi Michał");
    }

//    private static void hi(String name) {
//        System.out.println("Hi " + name);
//    }
//
//    private static void hi(String name, String name2) {
//        System.out.println("Hi " + name + ", " + name2);
//    }

    private static void hi(String... names) {
        String result = "";
        for (String s : names) {
            result = result + s + ", ";
        }
        System.out.println("Hi " + result);
    }

    private static int addition(int... a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

    private static boolean checkBy3(int a) {
//        if(a%3==0)
//            return true;
//        else
//            return false;
        return a % 3 == 0;
    }

    private static void foo() {
        System.out.println("foo");
        foo();
    }

    // n! // 5! = 5*4*3*2*1

    private static long factorial(long n) {
        if(n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }

}
