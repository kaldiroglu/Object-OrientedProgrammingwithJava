package org.javaturk.oopj.ch03.overriding.problem;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Child extends Parent {

	/**
	 *  This is hiding.
	 *  When static is removed from g() it tries to override static method of Parent, which is an error.
 	 */
	public static void f() {

	}

	/**
	 * This is overriding.
	 * Put "static" keyword and try to override an instance method in parent. It is an error!
	 * A static method in the child class can't hide an instance method of the parent class, which is an error.
	 */
	 public void g() {
		System.out.println("g() in Child");
	}

}
