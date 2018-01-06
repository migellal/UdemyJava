package pl.michalgellert.udemy.variables;

public class Variables {
    public static void main(String[] args) {
        byte b = 127;
        byte b1 = -128;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        Integer integer = 2;
        int sum = i + 1;
        long l = Long.MAX_VALUE;
        Long l1 = 23L;

        float f = Float.MAX_VALUE;
        float f1 = 1.1f;
        double d = Double.MAX_VALUE;
        double d1 = 0.0;

        char c = 'a';
        String helloHowAreYou = "Hello, how are you?";

        boolean boo = true;
        boolean boo2 = false;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(helloHowAreYou);
        System.out.println(boo);
    }
}
