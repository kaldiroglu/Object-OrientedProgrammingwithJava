package org.javaturk.oopj.ch02.factories.factory3;

public class Test {

	public static void main(String[] args) {
		System.out.println("*****   Factory 2   *****\n");
		Employee e = new Employee(1, "Ali", 14, "Production");
		System.out.println();
		Manager m = new Manager(2, "Fatma", 3, "Production", "Production");
//		m.printInfo();
		System.out.println();
		Director d = new Director(3, "Mehmet", 2, "Management", "Management", 10000);
	}
}
