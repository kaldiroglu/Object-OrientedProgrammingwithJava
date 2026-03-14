package org.javaturk.oopj.ch15.set;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class HashSetPerformance {

    public static void main(String[] args) {
//        run1();
        run2();
    }

    public static void run1() {
        int size = 40_000_000;
        Set set1 = new HashSet(size);

        Instant start = Instant.now();
        for (int i = 0; i < size; i++)
            set1.add(i);
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.printf("Time to add to a set with an initial size: %d ms.\n", timeElapsed);

        Set set2 = new HashSet();

         start = Instant.now();
        for (int i = 0; i < size; i++)
            set2.add(i);
        finish = Instant.now();

        timeElapsed = Duration.between(start, finish).toMillis();
        System.out.printf("Time to add to a set without an initial size: %d ms.", timeElapsed);
    }

    public static void run2() {
        int size = 50_000_000;
        Set set = new HashSet(size);

        Instant start = Instant.now();
        for (int i = 0; i < size; i++)
            set.add(i);
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.printf("Time to add to a set: %d ms.\n", timeElapsed);

        int[] ints = new int[size];

        start = Instant.now();
        for (int i = 0; i < size; i++)
            ints[i] = i;
        finish = Instant.now();

        timeElapsed = Duration.between(start, finish).toMillis();
        System.out.printf("Time to add to an array: %d ms.", timeElapsed);
    }
}
