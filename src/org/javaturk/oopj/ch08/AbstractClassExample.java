
package org.javaturk.oopj.ch08;

public class AbstractClassExample extends AbstractClass {

	@Override
	public void aMethod() {
		System.out.println("aMethod() in AbstractClassExample");
	}
	
	@Override
	public void anotherMethod() {
		System.out.println("anotherMethod() in AbstractClassExample");
	}
	
	public static void main(String[] args) {
//		AbstractClass o1 = new AbstractClass();
		AbstractClass o2 = new AbstractClassExample();
		o2.aMethod();
		o2.anotherMethod();
	}
}

abstract class AbstractClass {
	
	public void aMethod() {
		System.out.println("aMethod() in AbstractClass");
	}

	/**
	 * That's just a declaration. It is a protocol between AbstractClass and ist sub-classes.
	 * It is a hand-shake or agreement among them.
	 */
	public abstract void anotherMethod();
}
