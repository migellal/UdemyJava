package pl.michalgellert.udemy.strings;

import pl.michalgellert.udemy.solutions.Invoice;

public class FunWithString {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(null, 0, null, 0);

        System.out.println(invoice.toString());
        System.out.println(invoice);

        String text = "a".concat("b");
        String text2 = "a" + "b";

        System.out.println(text);
        System.out.println(text2);

//        if(text==text2) { !!!
//            System.out.println("equals");
//        }

        if(text.equals(text2)) {
            System.out.println("equals");
        }

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String s = "a,b,c,d,e";
        String[] strings = s.split(",");

        System.out.println(strings[2]);

    }
}
