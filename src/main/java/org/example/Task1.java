package org.example;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping without temporary variable
        str1 = str1 + str2; // Concatenate str1 and str2
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract str1 from concatenated string
        str1 = str1.substring(str2.length()); // Extract str2 from concatenated string

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);


        String str_1="Hello";
        String str_2="World";
        StringBuilder strB1=new StringBuilder(str_1);
        StringBuilder strB2=new StringBuilder(str_2);
        str_1 = strB2.toString();
        str_2 = strB1.toString();

        System.out.println(str_1);
        System.out.println(str_2);


    }
}
