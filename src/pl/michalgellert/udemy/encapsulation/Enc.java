package pl.michalgellert.udemy.encapsulation;

public class Enc {

    private static int x;
    protected int y;
    int z;

    public static void main(String[] args) {

    }

    private int getInside() {
        InsideEnc insideEnc = new InsideEnc();
        return insideEnc.insideZ;
    }

    private class InsideEnc {
        private int insideZ = 0;
    }
}
