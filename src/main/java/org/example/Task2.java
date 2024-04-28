package org.example;

public class Task2 {
    public static void main(String[] args) {

        //Find out how many alpha characters are present in a string?

        String str = "Hello 223#$% World";
        str = str.replace(" ","");
        str = str.replaceAll("[^a-z A-Z]","");
        System.out.println(str);
        System.out.println(str.length());

    }
}
