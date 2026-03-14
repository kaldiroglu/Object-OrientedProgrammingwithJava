package org.javaturk.oopj.ch06.factory;

import org.javaturk.oopj.ch06.factory.domain.Employee;
import org.javaturk.oopj.ch06.factory.domain.Manager;
import org.javaturk.oopj.ch06.factory.hr.HR;

public class TestHR {

	public static void main(String[] args) {
		HR hr = new HR();

		Employee e = hr.getAnEmployee();
		e.work();
		System.out.println();
	}
}
