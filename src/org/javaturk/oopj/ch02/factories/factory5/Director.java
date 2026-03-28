package org.javaturk.oopj.ch02.factories.factory5;

public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String departmentManaged, double bonus) {
		if(name == null || name.isEmpty())
			throw new IllegalArgumentException("Name cannot be null or empty");
		if(workingDepartment == null || workingDepartment.isEmpty())
			throw new IllegalArgumentException("Department cannot be null or empty");
		if(departmentManaged == null || departmentManaged.isEmpty())
			throw new IllegalArgumentException("Department managed cannot be null or empty");
		if(bonus < 0)
			this.bonus = 0;
		else this.bonus = bonus;

		super(no, name, year, workingDepartment, departmentManaged);
	}
	
	public void makeStrategicPlan(){
		System.out.println("Director makes a strategic plan for the company!");
	}
}
