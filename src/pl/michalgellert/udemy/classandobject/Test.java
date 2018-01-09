package pl.michalgellert.udemy.classandobject;

public class Test {

    public static void main(String[] args) {
        int x = 1;
        String s = " ";

        Client client1 = new Client();
        client1.name = "Michał";
        s = Client.COMPANY_NAME;

        System.out.println(client1.name);
    }
}
