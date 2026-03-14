package org.javaturk.oopj.ch13.overriding;

import org.javaturk.oopj.ch08.factory.Director;
import org.javaturk.oopj.ch08.factory.Manager;

public class HRForManagers2 extends HR {
	
	@Override
	public Manager getAnEmployee(int no) {
		Manager m = null;
		switch (no) {
		case 0:
			m = new Manager(1, "Ali the Manager", 12, "Production");
			break;
		case 1:
			m = new Director(6, "Salih the Director", 26, "Management", "Management", 5000);
			break;
		default:
			m = new Manager(-1, "Deneme", 12, "Deneme");
		}

		return m;
	}
}
