package org.example;

public class Task7 {

        public static void main(String[] args) {
        /*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world! This is a:Test".*/

            String str = "Hello, world! This is a test.";
            String[] words = str.split("[\\s\\p{Punct}]+");
            int count = 0;
            for(String w: words){
                if (! w.isEmpty());
                count++;
            }
            System.out.println(count);
        }
}
