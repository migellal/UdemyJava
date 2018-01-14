package pl.michalgellert.udemy.polymorphism;

import pl.michalgellert.udemy.interfaces.Document;
import pl.michalgellert.udemy.interfaces.DrawDocument;
import pl.michalgellert.udemy.interfaces.TxtDocument;

public class Poly {

    public static void main(String[] args) {

        Document draw = new DrawDocument();

        if(draw instanceof DrawDocument) {
            System.out.println(true);
        }
        if (draw instanceof TxtDocument) {
            System.out.println(true);
        }

        Box<Document> box = new Box<>();
        box.setT(new TxtDocument());
        box.setT(new DrawDocument());

//        Box<String> b2 = new Box<>();
//        b2.setT("");
    }
}
