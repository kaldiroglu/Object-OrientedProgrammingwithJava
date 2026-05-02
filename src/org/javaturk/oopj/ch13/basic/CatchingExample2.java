package org.javaturk.oopj.ch13.basic;

/**
 * This is a little bit modified version of CatchingExample2
 */
public class CatchingExample2 {

    public static void main(String[] args) {
        doSomething();
        System.out.println("After doSomething()!");
    }

    private static void doSomething() {
        doSomethingElse();
    }

    private static void doSomethingElse() {
        try {
            throwThrowable();
            System.out.println("After throwThrowable()-1!");
        } catch (Throwable e) {
            System.out.println("Catching a Throwable: " + e.getMessage());
        }
        System.out.println("After throwThrowable()-2!");
    }

    public static void throwThrowable() throws Throwable {
        double random = Math.random();
        if (random < 0.5) {
            System.out.println("I have a problem while I am doing my work :(. Random: " + random);
            Throwable throwable = new Throwable("Just kidding!");
            throw throwable;
        } else
            System.out.println("I am doing my work without any problem at all :)");
    }
}
