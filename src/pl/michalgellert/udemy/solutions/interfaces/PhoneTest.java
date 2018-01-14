package pl.michalgellert.udemy.solutions.interfaces;

public class PhoneTest {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Regularphone regularphone = new Regularphone();
        smartphone.sendMms(null, 111111111);
        regularphone.sendSms("Hi, how are you?", 111111111);
        smartphone.call(111111111);
    }
}
