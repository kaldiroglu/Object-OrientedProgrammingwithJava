package org.javaturk.oopj.ch02.substitutability;

public class SubstitutabilityExample {

	public static void main(String[] args) {

		Parent.f();
		Child.f();
		System.out.println(Parent.s);
//		System.out.println(Child.s); // Can't reach it, it is private!

		System.out.println();

		Parent parent = new Parent();
		parent.g();

		Child child = new Child();
		child.g();
		
		System.out.println(parent.i);
		System.out.println(parent.b);
//		System.out.println(child.i); // Can't reach it, it is private!
//		System.out.println(child.b); // Can't reach it, it is private!
	}
}
