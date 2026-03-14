package org.javaturk.oopj.ch04;

import java.util.Random;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public final class FinalClass {

	public void f() {
		System.out.println("f() in FinalClass");
	}

	protected void g() {
		System.out.println("g() in FinalClass");
	}
	
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.f();
	}
}

//class ChildClass extends FinalClass{
//
//
//}
