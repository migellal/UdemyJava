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
    }
}
