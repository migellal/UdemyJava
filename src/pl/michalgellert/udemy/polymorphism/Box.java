package pl.michalgellert.udemy.polymorphism;

import pl.michalgellert.udemy.interfaces.Document;

public class Box<T extends Document> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
