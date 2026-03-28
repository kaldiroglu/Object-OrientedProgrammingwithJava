package org.javaturk.oopj.ch02.factories.factory5;

public class Employee {
	protected int no;
	protected String name;
	protected int year;
	protected String department;

	public static final int BASE_SALARY = 500;

	public Employee(int no, String name, int year) {
		if(name == null || name.isEmpty())
			throw new IllegalArgumentException("Name cannot be null or empty");
		this(no, name, year, "No Department");
	}

	public Employee(int no, String name, int year, String department) {
		if(name == null || name.isEmpty())
			throw new IllegalArgumentException("Name cannot be null or empty");
		if(department == null || department.isEmpty())
			department = "No Department";
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
	}

	public void work() {
		System.out.println("Employee is working!");
	}

	public double calculateSalary(){
		return year * BASE_SALARY;
	}

	public void printInfo() {
		System.out.println("\nNo: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
	}

	public static int getBaseSalary() {
		return BASE_SALARY;
	}
}
