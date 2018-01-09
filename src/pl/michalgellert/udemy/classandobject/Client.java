package pl.michalgellert.udemy.classandobject;

public class Client {

    public final static String COMPANY_NAME = "XEROX";

    private String firstName;
    private String lastName;
    private int NIP;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void introduceYourself() {
        System.out.println("Hello, I am " + getFirstAndLastName() + ".");
    }

    private String getFirstAndLastName() {
        return firstName + " " + lastName;
    }

    public int getNip() {
        return NIP;
    }

    public void setNip(int NIP) {
        this.NIP = NIP;
    }
}
