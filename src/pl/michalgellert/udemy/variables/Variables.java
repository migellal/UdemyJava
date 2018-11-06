package pl.michalgellert.udemy.variables;

public class Variables {

    // final static int AA = 11;

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

        // ------------------------------//

        System.out.println("Sum: " + b + b1);
        System.out.println("Sum: " + (b + b1));

        int x = 1 + 2;
        int x1 = x + b;
        int y = b - b1;
        int xx = y * y;
        int yy = x1 / x;
        double dd = x1 / x;
        double dx = 3;
        double dy = 7;
        double dz = dy / dx;
        int r = x1 % x;
        System.out.println(x1);
        System.out.println(yy); // 130/3 = 43 i 1/3
        System.out.println(dd); // 130/3 = 43 i 1/3
        System.out.println(dz); // 7/3 = 43 i 1/3
        System.out.println(r); // 130/3 = 43 i 1/3

        // -----------------------------//

        int i1 = 10;
        int i2 = 20;
        int i3 = 30;
        int i4 = 40;
        System.out.println("------------------------------------------------");
        System.out.println(i1++); //i1 = i1+1;
        System.out.println(i1); //i1 = i1+1;
        System.out.println(++i2); //i2 = i2+1;
        System.out.println(i3--); //i3 = i3-1;
        System.out.println(i3); //i3 = i3-1;
        System.out.println(--i4); //i4 = i4-1;

        x += 5; // x = x + 5;
        x -= 5; // x = x - 5;
        x *= 5; // x = x * 5;
        x /= 5; // x = x / 5;
        x %= 5; // x = x % 5;

        System.out.println(x);

        // -------------const-------------------//

        final int Z_Z = 13;
        int z1;
        z1 = 8;
        // z *= 2;
        System.out.println(Z_Z);

        // ------------var---------------------//

        var sdf = 7;
//        var q;
//        var w = null;
        var g = 1; // int -> long
        var e = 1.1; // double
        var q = "napis";
        var w = 'q';
    }
}
