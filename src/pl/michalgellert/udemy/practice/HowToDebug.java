package pl.michalgellert.udemy.practice;

public class HowToDebug {

    public static void main(String[] args) {

        System.out.println("Hello");
        var name = "Michał";

        for (int i = 0; i < 6; i++) {
            if(i==4)
                System.out.println(i);
            if(i==2)
                System.out.println("dwa");
        }
    }
}
