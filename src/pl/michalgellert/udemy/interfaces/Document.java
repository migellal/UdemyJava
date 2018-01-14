package pl.michalgellert.udemy.interfaces;

public interface Document /* extends OnClickListener */ {

    public String d = "d";
    // private void foo();

    public boolean save();

    public String open(String path);

    public default void introduceYourself() {
        System.out.println("interface Document");
    }
}

// Telephone, 3 dowolne metody. 2 klasy, które będą implementowały.