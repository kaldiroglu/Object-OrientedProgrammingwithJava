package org.javaturk.oopj.ch15.list;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque queue = new ArrayDeque();
		System.out.println("At the beginning");
		queue.forEach(System.out::println);

//		System.out.println("Empty? " + queue.empty());
//		System.out.println("Size: " + queue.size());
//
//		System.out.println("\nPopulating.");
//		System.out.println("Pushing: " + queue.push("one"));
//		System.out.println("Pushing: " + queue.push("two"));
//		System.out.println("Pushing: " + queue.push("three"));

		System.out.println("\nAfter populating.");
		System.out.println("Size: " + queue.size());
		queue.forEach(System.out::println);

		System.out.println("\nPoping: " + queue.pop());
		System.out.println("\nAfter poping.");
		System.out.println("Size: " + queue.size());
		queue.forEach(System.out::println);

		System.out.println("\nPeeking: " + queue.peek());
		System.out.println("\nAfter peeking.");
		System.out.println("Size: " + queue.size());
		queue.forEach(System.out::println);

		System.out.println("\nPoping: " + queue.pop());
		System.out.println("\nPeeking: " + queue.peek());

		System.out.println("Size: " + queue.size());
		queue.forEach(System.out::println);
	}

}
