package pl.michalgellert.udemy.interfaces;

public interface Document {

    public String d = "d";
    // private void foo();

    public boolean save();

    public String open(String path);

    public default void introduceYourself() {
        System.out.println("interface Document");
    }
}
