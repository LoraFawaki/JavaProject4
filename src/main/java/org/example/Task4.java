package org.example;

public class Task4 {
    public static void main(String[] args) {
        /*
        Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.
         */

        String str = "madam";
        StringBuilder strB=new StringBuilder(str);
        String str1 = strB.reverse().toString();
        System.out.println(str.equals(str1));
    }
}
