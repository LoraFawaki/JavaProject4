package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        /*
        You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".
         */
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Ant");
        stringList.add("Cat");
        stringList.add("Alphabet");
        stringList.removeIf(x-> (x.charAt(0) != 'A'));
        String lastString = stringList.toString();
        System.out.println(lastString.toLowerCase());

    }
}
