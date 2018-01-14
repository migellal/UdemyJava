package pl.michalgellert.udemy.inheritance;

public class FactoryTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        PhoneFactory phoneFactory = new PhoneFactory();

        carFactory.produce();
        phoneFactory.produce();
        carFactory.testDrive();
        phoneFactory.testCall();

        carFactory.checkState();
        phoneFactory.checkState();

//        Factory factory = new Factory() {
//            @Override
//            public void produce() {
//                super.produce();
//            }
//
//            @Override
//            public void checkState() {
//                super.checkState();
//            }
//        };

        System.out.println(phoneFactory.introduceYourself());

    }
}
