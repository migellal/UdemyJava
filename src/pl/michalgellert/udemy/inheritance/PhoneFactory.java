package pl.michalgellert.udemy.inheritance;

public class PhoneFactory extends Factory {

    public void testCall() {
        System.out.println("testCall");
    }

    @Override
    public void destroy() {
        System.out.println("phoneDestroy");
    }
}
