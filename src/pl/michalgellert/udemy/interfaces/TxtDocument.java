package pl.michalgellert.udemy.interfaces;

public class TxtDocument implements Document {

    @Override
    public boolean save() {
        String s = d;
        // d = ""; dodatkowe operacje
        System.out.println("Save Txt Doc.");
        return true;
    }

    @Override
    public String open(String path) {
        // dodatkowe operacje
        return "txt file: " + path;
    }
}
