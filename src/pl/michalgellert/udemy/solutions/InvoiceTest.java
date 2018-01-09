package pl.michalgellert.udemy.solutions;

import pl.michalgellert.udemy.classandobject.Address;
import pl.michalgellert.udemy.classandobject.Client;

public class InvoiceTest {

    public static void main(String[] args) {

        Client michael = new Client();
        michael.setFirstName("Michael");
        michael.setLastName("Forbes");
        michael.setAddress(new Address("Warsaw", "00-001"));
        michael.setNip(1234);

        Invoice invoice = new Invoice(michael, 1,"09-01-2017", 89);

        System.out.println(invoice.calculateTax());
    }
}
