package org.javaturk.oopj.ch04.sealing.shape;

public class ReflectionTest {

	public static void main(String[] args) {
		Class clazz = Shape.class;
		if (clazz.isSealed()) {
			Class[] permittedSubClasses = clazz.getPermittedSubclasses();
			for (Class c : permittedSubClasses)
				System.out.println(c);
		}
		else
			System.out.println("Class is not sealed!");
	}
}
