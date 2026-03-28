package org.javaturk.oopj.ch02.factories.factory5;


public class Manager extends Employee {
	protected String departmentManaged;

	public static final int MANAGEMENT_PAYMENT = 3000;

	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged) {
		if(name == null || name.isEmpty())
			throw new IllegalArgumentException("Name cannot be null or empty");
		if(workingDepartment == null || workingDepartment.isEmpty())
			throw new IllegalArgumentException("Department cannot be null or empty");
		if(departmentManaged == null || departmentManaged.isEmpty())
			throw new IllegalArgumentException("Department managed cannot be null or empty");
		this.departmentManaged = departmentManaged;

		super(no, name, year, workingDepartment);
	}

	public void manage() {
		System.out.println("Manager manages department: " + departmentManaged);
	}
}
