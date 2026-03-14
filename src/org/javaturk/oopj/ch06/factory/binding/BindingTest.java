package org.javaturk.oopj.ch06.factory.binding;


import org.javaturk.oopj.ch06.factory.domain.*;
import org.javaturk.oopj.ch06.factory.hr.HR;

public class BindingTest {

	public static void main(String[] args) {
		HR hr = new HR();
		
		Employee e = hr.getAnEmployee();
		e.work();

		Boss boss = new Boss();
		boss.youWorkToo();
	}
}
