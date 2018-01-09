package pl.michalgellert.udemy.solutions;

import pl.michalgellert.udemy.classandobject.Client;

public class Invoice {

    public static double VAT = 0.19;

    public Invoice(Client client, int id, String date, int income) {
        this.client = client;
        this.id = id;
        this.date = date;
        this.income = income;
    }

    private Client client;
    private int id;
    private String date;
    private int income;

    public double calculateTax() {
        return (0.19 * income);
    }
}
