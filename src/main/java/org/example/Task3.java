package org.example;

public class Task3 {
    public static void main(String[] args) {

        String str="Hello";
        StringBuilder strB=new StringBuilder(str);
        String strReverse = strB.reverse().toString();
        System.out.println(strReverse);


        String str1="I Love Java and enjoy its tasks";
        String [] strSplit = str1.split(" ");
        for (String s:strSplit){
            StringBuilder strB1= new StringBuilder(s);
            strB1.reverse();
            System.out.print(strB1+ " ");
        }
    }
}
