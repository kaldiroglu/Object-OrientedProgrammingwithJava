package org.javaturk.oopj.ch05;

import org.javaturk.oopj.ch05.domain.Product;

public class CloneExample {

	public static void main(String[] args) {

		Object o1 = new Object();
//		Object o2 = o1.clone();


		Product p1 = new Product(11, "Kanepe", 170.0);
		System.out.println(p1);
		Product p2 = (Product) p1.clone();
		System.out.println(p2);

		if (p1 == p2)
			System.out.println("The same");
		else
			System.out.println("Different");

		boolean b = p1.equals(p2);
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
	}
}
