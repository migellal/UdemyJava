package pl.michalgellert.udemy.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IO {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                String line = sc.nextLine();
                if (line.equals("+") || line.equals("*")) {
                    if (ints.size() >= 2) {
                        Integer result;
                        if (line.equals("+"))
                            result = 0;
                        else
                            result = 1;
                        for (Integer i : ints) {
                            if (line.equals("+"))
                                result += i;
                            else
                                result *= i;
                        }
                        System.out.println(result);
                        System.exit(0);
                    } else {
                        System.err.println("Write more digit");
                    }
                } else {
                    try {
                        ints.add(Integer.parseInt(line));
                    } catch (NumberFormatException nfe) {
                        System.err.println("Write digit");
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
