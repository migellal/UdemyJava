package pl.michalgellert.udemy.strings;

public class StringJava11 {
    public static void main(String[] args) {
        var text = "text text";
        System.out.println(text.repeat(5));
        System.out.println(text.repeat(0));
        System.out.println("        ".isBlank());
        System.out.println("                ".isBlank());
        System.out.println("     text  text      ".strip());
        System.out.println("     text  text      ".stripLeading());
        System.out.println("     text  text      ".stripTrailing());
        System.out.println("on\noff\n1\n0\n".lines().count());
    }
}
