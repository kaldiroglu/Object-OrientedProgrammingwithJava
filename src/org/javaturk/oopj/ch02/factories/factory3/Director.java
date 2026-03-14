package org.javaturk.oopj.ch02.factories.factory3;

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

	// Olması gereken!
//	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
//		super(no, name, year, workingDepartment, managingDepartment);
//		this.bonus = bonus;
//		System.out.println("in Director()");
//	}

	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super();
		this.no = no;   // Kod tekrarı
		this.name = name;   // Kod tekrarı
		this.year = year;   // Kod tekrarı
		this.department = workingDepartment;   // Kod tekrarı
		this.departmentManaged = departmentManaged;   // Kod tekrarı
		this.bonus = bonus;
		System.out.println("in Director()");
	}
}
