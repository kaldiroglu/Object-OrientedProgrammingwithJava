package org.javaturk.oopj.ch13.finaly;

import java.io.IOException;

public class FinallyExample2 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        System.out.println("in f() before g()");
        int x = g();
        System.out.println("x: " + x);
        System.out.println("in f() after g()");
    }

    public static int g() {
        int i = 5;
        try{
            throw new IOException();
        }
        catch(IOException e){
            i++;
            System.out.println("in catch()");
            return i;
        }
        finally{
            // Runs before returning i otherwise i.e. if finally run after returning i it would have lost the value of i.
            System.out.println("in finally and i: " + i);
        }
    }
}
