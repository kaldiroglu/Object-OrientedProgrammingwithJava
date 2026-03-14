package org.javaturk.oopj.ch15.sequenced;

import java.util.ArrayList;
import java.util.List;

public class SequencedListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // [1]
        arrayList.addFirst(0); // [0, 1]
        arrayList.addLast(2); // [0, 1, 2]
        arrayList.add(3); // [0, 1, 2, 3]

        System.out.println("\nArraylist");
        arrayList.forEach(System.out::println);

        System.out.println("\nFirst: " + arrayList.getFirst()); // 0
        System.out.println("Last: " + arrayList.getLast());   // 3

        System.out.println("\nRemove first: " + arrayList.removeFirst()); // Remove 0
        System.out.println("\nRemove last: " + arrayList.removeLast());   // Remove 3

        System.out.println("\nArraylist After Remove");
        arrayList.forEach(System.out::println);

        arrayList.addFirst(10); // [10, 1, 2]
        arrayList.addLast(20); // [10, 1, 2, 20]

        System.out.println("\nReversed");
        List<Integer> reversedList = arrayList.reversed();
        reversedList.forEach(System.out::println); // [20, 2, 1, 10]
    }
}
