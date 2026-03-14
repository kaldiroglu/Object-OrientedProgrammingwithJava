
package org.javaturk.oopj.ch08.persistence.service;


import org.javaturk.oopj.ch08.persistence.domain.Employee;
import org.javaturk.oopj.ch08.persistence.dao.*;

public class EmployeeService {
	
	private AbstractDao employeeDao;
	
	public EmployeeService(EmployeeDao employeeDao){
		this.employeeDao = employeeDao;
	}
	
	public void createEmployee(Employee employee){
		employeeDao.save(employee);
	}
	
	public void changePassword(Employee employee, String newPassword){
		employee.setPassword(newPassword);
		employeeDao.update(employee);
	}
}
