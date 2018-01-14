package pl.michalgellert.udemy.solutions.interfaces;

public class Regularphone implements Phone {

    @Override
    public boolean sendSms(String text, Integer number) {
        System.out.println("Write: " + text + " and send to: " + number);
        return true;
    }

    @Override
    public boolean sendMms(byte[] picture, Integer number) {
        System.out.println("Send: " + picture + " to: " + number);
        return true;
    }

    @Override
    public void call(Integer number) {
        System.out.println("Call to: " + number);
    }
}
