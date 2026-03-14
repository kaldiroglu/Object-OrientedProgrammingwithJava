package org.javaturk.oopj.ch15.sequenced;

import java.util.SequencedSet;
import java.util.Set;
import java.util.TreeSet;

public class SequencedSetExample {

    public static void main(String[] args) {
        SequencedSet<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(0);

        System.out.println("\nSet");
        set.forEach(System.out::println);

        set.addFirst(-2);
//        System.out.println("\nSet after addFirst");
//        set.forEach(System.out::println);

//        set.addLast(10);
//        System.out.println("\nSet after addLast");
//        set.forEach(System.out::println);

        System.out.println("First: " + set.getFirst());
        System.out.println("Last: " + set.getLast());
        System.out.println("Remove first: " + set.removeFirst());
        System.out.println("Remove last: " + set.removeLast());

        System.out.println("\nSet");
        set.forEach(System.out::println);

        System.out.println("\nReversed");
        Set<Integer> reversedSet = set.reversed();
        reversedSet.forEach(System.out::println);
    }
}
