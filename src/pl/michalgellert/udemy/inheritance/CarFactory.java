package pl.michalgellert.udemy.inheritance;

public class CarFactory extends Factory {

    @Override
    public void checkState() {
        super.checkState();
        System.out.println("checkStateInCarFactory");
    }

    public void testDrive() {
        System.out.println("testDrive");
    }

    @Override
    public void destroy() {
        System.out.println("carDestroy");
    }
}
