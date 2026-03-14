package org.javaturk.oopj.ch05;

public class StringEquality {

    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        if(s1 == s2)
            System.out.println("Same");
        else
            System.out.println("Different");

        if(s1.equals(s2))
            System.out.println("Same");
        else
            System.out.println("Different");

        System.out.println("****************");

        String s3 = "Java";
        String s4 = "Java";

        if(s3 == s4)
            System.out.println("Same");
        else
            System.out.println("Different");

        if(s3.equals(s4))
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}
