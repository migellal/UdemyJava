package pl.michalgellert.udemy.methods;

public class Methods {

    public static void main(String[] args) {
        sayHi();
        hi();
        hi("Karol");
        hi("Maciek", "Jacek");
        hi("Maciek", "Jacek", "Wojtek");
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
        for(String s : names) {
            result = result + s + ", ";
        }
        System.out.println("Hi " + result);
    }

    private static void addition(int a, int b) {
        System.out.println((a + b));
    }

}
