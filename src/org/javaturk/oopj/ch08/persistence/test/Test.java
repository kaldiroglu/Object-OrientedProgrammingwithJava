
package org.javaturk.oopj.ch08.persistence.test;

import org.javaturk.oopj.ch08.persistence.dao.EmployeeDao;
import org.javaturk.oopj.ch08.persistence.domain.Employee;
import org.javaturk.oopj.ch08.persistence.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDao();
		EmployeeService employeeService = new EmployeeService(employeeDao);
		
		Employee employee = new Employee(5555, "Mehmet", 8, "Production", "mmm");
		employeeService.createEmployee(employee);
		
		employeeService.changePassword(employee, "mmm55");

		java.util.AbstractList al;
	}
}
