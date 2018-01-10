package pl.michalgellert.udemy.solutions;

public class EncryptionTest {

    public static void main(String[] args) {
        String source = "Czy na sali jest ktoś, kto potrafi odczytać ten kod?";
        String encode = Encryption.encode(source);
        String decode = Encryption.decode(encode);
        System.out.println(source);
        System.out.println(encode);
        System.out.println(decode);
    }
}
