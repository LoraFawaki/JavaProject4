package org.example;

public class Task6 {
    public static void main(String[] args) {
        /*Create a method to count how many vowels are present in a string
“documentation”

         */

        String str="documentations";
        String vowelsOnly = str.replaceAll("[^aoeui]","");
        System.out.println(vowelsOnly);
        System.out.println(vowelsOnly.length());

    }
}
