package pl.michalgellert.udemy.classandobject;

public class Test {

    public static void main(String[] args) {
//        int x = 1;
//        String s = " ";
//
//        Client client1 = new Client();
//        client1.name = "Michał";
//        s = Client.COMPANY_NAME;
//
//        System.out.println(client1.name);
//
//        Client client2 = null;
//
//        System.out.println(client1);
//        System.out.println(client2);
//
//        if(client2!=null) {
//            System.out.println(client2.name);
//        }

        Client clientMichael = new Client();

        clientMichael.setFirstName("Michael");
        clientMichael.setLastName("Forbes");

        Address michaelAddress = new Address("Warszawa", "00-001");
//        michaelAddress.setPostCode("00-001");
//        michaelAddress.setPostOffice("Warsaw");

        clientMichael.setAddress(michaelAddress);

        System.out.println(clientMichael.getLastName());
        System.out.println(Client.COMPANY_NAME);

        clientMichael.introduceYourself();
    }
}
