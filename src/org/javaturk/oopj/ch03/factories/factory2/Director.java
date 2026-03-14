package org.javaturk.oopj.ch03.factories.factory2;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
	}
	
	@Override
	public void work(){
		System.out.println("Director is working!");
		manage();
	}
	
	@Override
	public void manage(){
		System.out.println("Director manages whole company!");
		makeStrategicPlan();
	}
	
	public void makeStrategicPlan(){
		System.out.println("Director makes a strategic plan for the company!");
	}

	public double calculateSalary(){
		return super.calculateSalary() + bonus;
	}

//	public double calculateSalary(){
//		return year * BASE_SALARY + MANAGEMENT_PAYMENT + bonus;
//	}

	
	public void printInfo(){
		System.out.println("Director Info");
		System.out.println("\nNo: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
		System.out.println("Managing Department: " + departmentManaged);
	}
}
