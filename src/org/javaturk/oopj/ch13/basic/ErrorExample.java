package org.javaturk.oopj.ch13.basic;

public class ErrorExample {
	static int count;

	public static void main(String[] args) {
//		throwError1();
//		throwError2();
		recursiveMethod();
		System.out.println("At the end of main method!");
	}

	public static void throwError1() { // No need for throws OutOfMemoryError!
		System.out.println("I'll throw an error now!");
		throw new OutOfMemoryError("Just kidding!");
	}

	public static void throwError2() {
		System.out.println("I'll throw an error now!");
		try {
			throw new OutOfMemoryError("Just kidding!");
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
	}

	public static void recursiveMethod() {
		count++;
		System.out.println(count);
		recursiveMethod();
	}
}
