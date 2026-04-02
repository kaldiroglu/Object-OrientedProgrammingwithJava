package org.javaturk.oopj.ch03.factories.factory1;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		e1.printInfo();
		System.out.println("Salary: " + e1.calculateSalary());
//		e1.work();

		System.out.println();
		
		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		m1.printInfo();
		System.out.println("Salary: " + m1.calculateSalary());
//		System.out.println("Maaşı: " + m1.calculateSalaryForManager());
//		m1.work();
//		m1.manage();
		
		System.out.println();

		Director d1 = new Director(4, "Mehmet", 1, "Management", "Management", 50_000);
		d1.printInfo();
		System.out.println("Salary: " + d1.calculateSalary());
//		System.out.println("Maaşı: " + d1.calculateSalaryForManager());
//		System.out.println("Maaşı: " + d1.calculateSalaryForDirector());
//		d1.work();
//		d1.makeAStrategicPlan();
	}
}
