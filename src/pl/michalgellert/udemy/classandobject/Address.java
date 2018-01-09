package pl.michalgellert.udemy.classandobject;

public class Address {

    private String postOffice;
    private String postCode;

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

//    public Address() {
//    }

    public Address(String postOffice, String postCode) {
        this.postOffice = postOffice;
        this.postCode = postCode;
        System.out.println("create new Address: " + postOffice);
    }
}
