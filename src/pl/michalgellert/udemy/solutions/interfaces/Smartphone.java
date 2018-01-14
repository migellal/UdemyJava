package pl.michalgellert.udemy.solutions.interfaces;

public class Smartphone implements Phone {

    @Override
    public boolean sendSms(String text, Integer number) {
        System.out.println("Open SMS APP, write: " + text + " and send to: " + number);
        return true;
    }

    @Override
    public boolean sendMms(byte[] picture, Integer number) {
        System.out.println("Open MMS APP, send: " + picture + " to: " + number);
        return true;
    }

    @Override
    public void call(Integer number) {
        System.out.println("Open dialer APP and call to: " + number);
    }
}
