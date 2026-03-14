package org.javaturk.oopj.ch06.factory.office;

import org.javaturk.oopj.ch06.factory.domain.Employee;

public class PayrollOffice {
	public void paySalary(Employee employee) { // employee = m1;
		double salary = employee.calculateSalary();
		System.out.println("Paying a salary of " + salary + " to " + employee.getName());
	}
}
