package org.javaturk.oopj.ch09.factories.factory3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		int n = 10;
		Employee[] employees = new Employee[n];
		for(int i = 0; i < n; i++)
			employees[i] = hr.getAnEmployee();
		
		System.out.println("Before sorting");
		for(Employee e : employees)
			System.out.println(e);
		
		System.out.println("\nAfter sorting");
		Arrays.sort(employees);
		for(Employee e : employees)
			System.out.println(e);
		
		System.out.println("***********************");
		
		Employee e1 = hr.getAnEmployee();
		System.out.println(e1);
		Employee e2 = hr.getAnEmployee();
		System.out.println(e2);

		if(e1 instanceof Comparable)
			System.out.println("It is Comparable!");
		else
			System.out.println("It is NOT Comparable!");

//		int comparison = e1.compareTo(e2);
//		System.out.println("\nComparison: " + comparison);
//
//		comparison = e2.compareTo(e1);
//		System.out.println("Comparison: " + comparison);
//
//		comparison = e1.compareTo(e1);
//		System.out.println("Comparison: " + comparison);
	}
}
