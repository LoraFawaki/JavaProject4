package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        /*
        How can you remove all duplicates from ArrayList?
         */

        ArrayList<String> aList = new ArrayList<>();
        aList.add("James");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> noDuplicates = new HashSet<>(aList);
        System.out.println(noDuplicates);

    }
}
