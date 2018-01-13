package pl.michalgellert.udemy.interfaces;

public class DocumentTest {

    public static void main(String[] args) {
        TxtDocument txt = new TxtDocument();
        DrawDocument draw = new DrawDocument();

        System.out.println(txt.open("txtPath"));
        System.out.println(draw.save());

        draw.introduceYourself();
    }
}
