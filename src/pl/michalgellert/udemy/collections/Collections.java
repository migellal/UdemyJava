package pl.michalgellert.udemy.collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("axc");
        list.add("tekst");
        list.add("tekst");
        list.add("abc");
        System.out.println(list);

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.addAll(list);
        treeSet.addAll(list);
        System.out.println(hashSet);
        System.out.println(treeSet);
    }
}
