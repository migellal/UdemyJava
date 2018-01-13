package pl.michalgellert.udemy.interfaces;

public class DrawDocument implements Document {

    @Override
    public boolean save() {
        System.out.println("Save Draw Doc.");
        return true;
    }

    @Override
    public String open(String path) {
        return "draw file: " + path;
    }
}
