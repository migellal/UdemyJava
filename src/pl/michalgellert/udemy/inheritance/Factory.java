package pl.michalgellert.udemy.inheritance;

public abstract class Factory {

    public final void produce() {
        System.out.println("produce");
    }

    public void checkState() {
        System.out.println("checkState");
    }

    public abstract void destroy();

    public String introduceYourself() {
        return "Factory";
    }

}
