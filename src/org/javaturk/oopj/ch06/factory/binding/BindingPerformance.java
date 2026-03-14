package org.javaturk.oopj.ch06.factory.binding;

import java.time.Duration;
import java.time.Instant;

import static java.lang.Math.sqrt;

public class BindingPerformance {

    public static void main(String[] args) {
        long count = 2_500_000_000L;
        A a = new A();
        B b = new B();

        Instant start = Instant.now();
        a.f(count);
        Instant finish = Instant.now();

        Duration d = Duration.between(start, finish);
        System.out.println("Time: " + d.toMillis() + " ms.");

        start = Instant.now();
        b.f(count);
        finish = Instant.now();
        d = Duration.between(start, finish);
        System.out.println("Time: " + d.toMillis() + " ms.");
    }
}

class A {
    int i;

    int f(long count ) {
        ++i;
        for (int j = 0; j < count; j++)
            if (sqrt(i) < 1)
                --i;
        return ++i;
    }
}

final class B {
    int i;

    final int f(long count) {
        ++i;
        for (int j = 0; j < count; j++)
            if (sqrt(i) < 1)
                --i;
        return ++i;
    }
}
