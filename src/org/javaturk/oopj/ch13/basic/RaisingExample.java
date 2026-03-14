package org.javaturk.oopj.ch13.basic;

/**
 * In this example all methods throws Throwable. So the Throwable object is raised into a higher context all the time.
 */
public class RaisingExample {

	public static void main(String[] args) throws Throwable {
		doSomething();
		System.out.println("After doSomething()!");
	}
	
	private static void doSomething() throws Throwable {
		doSomethingElse();		
	}
	
	private static void doSomethingElse() throws Throwable{
            throwThrowable();
    }

	public static void throwThrowable() throws Throwable {
		Throwable throwable = new Throwable("Just kidding!");
		throw throwable;
	}
}
