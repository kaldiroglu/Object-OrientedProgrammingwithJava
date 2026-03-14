package org.javaturk.oopj.ch13.overriding;


import org.javaturk.oopj.ch08.factory.*;

public class HR {

	public Employee getAnEmployee(int no) throws NoSuchEmployeeException {
		Employee e = null;
		switch (no) {
		case 1:
			e = new Secretary(1, "Sevim", 9, "Sales", new Manager(3, "Kamil", 17, "Sales", "Sales"));
			break;
		case 2:
			e = new Engineer(2, "Burhan", 5, "Production", "Improving production.");
			break;
		case 3:
			e = new Manager(3, "İsmail", 14, "Production", "Production");
			break;
		case 4:
			e = new Director(4, "Salih", 24, "Management", "Management", 4500);
			break;
		default:
			throw new NoSuchEmployeeException("no: " + no);
		}

		return e;
	}
}
