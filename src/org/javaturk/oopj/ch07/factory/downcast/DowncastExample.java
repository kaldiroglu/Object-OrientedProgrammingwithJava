package org.javaturk.oopj.ch07.factory.downcast;

import org.javaturk.oopj.ch07.factory.domain.*;
import org.javaturk.oopj.ch07.factory.hr.HR;

public class DowncastExample {

	public static void main(String[] args) {
//		impossibleDowncast();
//		downcast1();
		downcast2();
//		nullDowncast();
	}

	public static void downcast1(){
		// Upcasting
		Employee e1 = new Employee(5, "İsmail", 14, "Production");
		e1 = new Manager(5, "İsmail", 14, "Production", "Production");


		// Downcasting without problem
		Employee e2 = new Manager(5, "İsmail", 14, "Production", "Production");
		Manager m1 = (Manager) e2; // No ClassCastException thrown!
		m1.manage();

		// Downcasting with problem
		Employee e3 = new Employee(1, "Ali", 4, "Production");
		Manager m2 = (Manager) e3; // ClassCastException thrown!
		m2.manage();

		Director d1 = (Director) new Manager(5, "İsmail", 14, "Production", "Production"); // ClassCastException thrown!
		Director d2 = (Director) new Employee(1, "Ali", 4, "Production"); // ClassCastException thrown!
	}

	public static void downcast2(){
		HR hr = new HR();
		Employee e = hr.getAnEmployee();

		Manager m = (Manager) hr.getAnEmployee();
		m.manage();
	}

	public static void impossibleDowncast(){
		String s = "What's up dude?";
//		Employee e = (Employee) s;

		Integer i = 5;
//		Long l = (Long) i;
		Number n = i;
		Integer ii = (Integer) n;
	}

	public static void nullDowncast(){
		Employee e = null;
		Manager m = (Manager) e;
//		m.manage();
	}
}
