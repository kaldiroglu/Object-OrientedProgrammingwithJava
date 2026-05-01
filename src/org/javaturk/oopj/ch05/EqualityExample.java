package org.javaturk.oopj.ch05;

import org.javaturk.oopj.ch05.domain.Product;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class EqualityExample {

	public static void main(String[] args) {
		Object o ;

		Product p1 = new Product(11, "Kanepe", 171.99);
		Product p2 = new Product(11, "Kanepe", 171.99);
		
//		p1 = p2;
		
//		System.out.print("Is p1 = p2: ");
//		boolean b = p1 == p2; Boolean b3;
//		if (b)
//			System.out.println("The same");
//		else
//			System.out.println("Different");
//
//		System.out.print("\nIs p1 equals p2: ");
		
		boolean b = p1.equals(p2);
		
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		
		System.out.print("\nIs p2 equals p1: ");
		
		b = p2.equals(p1);
		
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
	}
}
