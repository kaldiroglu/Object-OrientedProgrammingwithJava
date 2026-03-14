
package org.javaturk.oopj.ch08;

//public final abstract class AbstractProblem {}

public abstract class AbstractProblem {
	static int count;

//	private abstract void aMethod1();
//	public static abstract void aMethod2();
//	public synchronized abstract void aMethod3();

	abstract void anotherMethod1();
	
	public abstract void anotherMethod2();

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		AbstractProblem.count = count;
	}

	public static void main(String[] args) {
		System.out.println("Selam abi :)");
		AbstractProblem.setCount(10);
		System.out.println("Count: " + AbstractProblem.getCount());
	}
}
