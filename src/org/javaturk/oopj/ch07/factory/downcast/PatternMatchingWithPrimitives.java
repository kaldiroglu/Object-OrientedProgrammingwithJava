package org.javaturk.oopj.ch07.factory.downcast;

import java.time.LocalDate;

public class PatternMatchingWithPrimitives {
    public static void main(String[] args) {
//        run1();
        run2();
    }

    static void run1() {
        float v1 = 1000.01f;

        if (v1 instanceof float f) System.out.println("float value: " + f);
        if (v1 instanceof double d) System.out.println("double value: " + d);
        if (v1 instanceof int i) System.out.println("int value: " + i);
//        if (v instanceof boolean b) System.out.println("int value: " + i); // Inconvertible types

        boolean b1 = !true;

//        if (b1 instanceof float f) System.out.println("float value: " + f);// Inconvertible types
//        if (b1 instanceof double d) System.out.println("double value: " + d);
//        if (b1 instanceof char c) System.out.println("char value: " + c);
//        if (b1 instanceof int i) System.out.println("int value: " + i);
        if (b1 instanceof boolean b) System.out.println("boolean value: " + b);
    }

    static void run2() {
        float rating= 2.5f;

        String ratingString = switch (rating) {
            case 0f -> "0 stars";
            case 2.5f -> "Average";
            case 5f -> "Best";
            case float f -> "Invalid rating: " + f;
        };

        System.out.println(ratingString);
    }
}
