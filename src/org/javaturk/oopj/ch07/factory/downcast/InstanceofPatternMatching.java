package org.javaturk.oopj.ch07.factory.downcast;

import org.javaturk.oopj.ch07.factory.domain.*;
import org.javaturk.oopj.ch07.factory.hr.HR;


public class InstanceofPatternMatching {

	public static void main(String[] args) {
//		run1();
//		scope1();
//		scope2();
//		scope3();
//		weirdScope();
	}
	
	static void run1() {
		HR hr = new HR();
		Employee e1 = hr.getAnEmployee();

		// Old way of using instanceof to match the correct type
		if (e1 instanceof Director) {
			System.out.println("Instance of Director");
			Director d = (Director) e1;
			d.makeStrategicPlan();
		} else if (e1 instanceof Manager) {
			System.out.println("Instance of Manager");
			Manager m = (Manager) e1;
			m.manage();
		} else if (e1 instanceof Employee) {
			System.out.println("Instance of Employee");
		} else
			System.out.println("Not an instance of Employee");

		System.out.println();

		// New way of using instanceof to match the correct type in Java 16
		if (e1 instanceof Director d) {
			System.out.println("Instance of Director");
			// No need to downcast
			// Director d = (Director) e1;
			d.makeStrategicPlan();
//			d is not final!
//			d = new Director(6, "Salih", 24, "Management", "Management", 4500);
		} else if (e1 instanceof Manager m) {
			System.out.println("Instance of Manager");
			// No need to downcast
			//Manager m = (Manager) e1;
			m.manage();
		} else
			System.out.println("Instance of Employee");

		System.out.println();

//		Can't do that!'
		boolean b = e1 instanceof Director d1;

		if (b) {
			System.out.println("Instance of Director");
//			d1.makeStrategicPlan();
		}
	}

	static void scope1() {
		Employee e = new Director(4, "Mehmet", 20, "Management", "Management", 3000);

		if (e instanceof Director d) {
			System.out.println("Instance of Director");
			d.makeStrategicPlan();
		} else  {
			System.out.println("Not an instance of Director");
			e.work();
//			d.makeStrategicPlan(); // Can't reach d here!
		}

//		d.makeStrategicPlan(); // Can't reach d here!
	}

	static void scope2() {
		Employee e = new Director(4, "Mehmet", 20, "Management", "Management", 3000);

		if (!(e instanceof Director d)) { // The scope of a pattern variable is the places where the program can reach only if the instanceof operator is true
			System.out.println("Not an instance of Director");
//			d.makeStrategicPlan(); // Can't reach d here!
		} else  {
			System.out.println("Instance of Director");
			e.work();
			d.makeStrategicPlan(); // Can reach d here!
		}

//		d.makeStrategicPlan(); // Can't reach d here!
	}

	/**
	 * This used to be a problem probably in JDK 14 or 15 and then suddenly it started working. JDK 21 has no problems with that.
	 * Probably when this feature was becoming mature and finalized, this was not seen as a problem
	 * anymore and started to be accepted as a valid code.
	 */
	static void run2() {
		Director e1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
		// Problem: Expression type cannot be a subtype of the Pattern type
		if (e1 instanceof Director d) {
			System.out.println("Instance of Director");
			d.makeStrategicPlan();
		}
	}

	static void scope3() {
		Number number = 123;
		if (!(number instanceof Integer data)) { // The scope of a pattern variable are the places where the program can reach only if the instanceof operator is true
			System.out.println("Not an instance of Integer");
//			 System.out.println(data); // Can't reach data here!
		}
		else
			System.out.println(data);
	}


	/**
	 * - Since e1 is a Director, condition is false, so if block is skipped.
	 * - Because the if block has return (or throw), Java knows:
	 *     if execution reaches the next line, the pattern must have matched.
	 * - So d is valid after the if, and d.makeStrategicPlan() compiles.
	 * If you remove return (and no else), Java can no longer guarantee that d exists after the if, so d.makeStrategicPlan() fails to compile.
	 * If you use else, d is in scope inside else, because else means the match was true.
	 */
	static void weirdScope() {
		Employee e1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
		if (!(e1 instanceof Director d)) { // "e1 instanceof Director" is true, so "!(e1 instanceof Director d)" is false, then flow doesn't go into if block!
			System.out.println("Not an instance of Director");
//			d.makeStrategicPlan();
			return; // remove return and see what happens!
//			throw new IllegalArgumentException();  // remove return and see what happens!
		} // Remove return above and open following else block!
//		else
			d.makeStrategicPlan();
	}
}
