package org.javaturk.oopj.ch06.binding;

public class StaticMethodHiding {

	public static void main(String[] args) {
		Parent parent = new Child1();
		parent.doIt();  // Parent's doIt is called
		parent.make();

		System.out.println();

		parent = new Child2();
		parent.doIt(); // Parent's doIt is called
		parent.make();
		
		System.out.println();
		
		Child1 child1 = new Child1();
		child1.doIt();
		Child1.doIt();
		Child2 child2 = new Child2();
		child2.doIt();
		Child2.doIt();
	}
}
