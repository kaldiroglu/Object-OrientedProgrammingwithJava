package org.javaturk.oopj.ch13.runtime.shape1;

import java.util.Random;

public class ShapeFactory {
	private static Random random = new Random();

	public static Shape produceShape() {
		Shape shape = null;

//		int i = Math.abs(random.nextInt() % 100);
		int i = random.nextInt() % 100;

		if(i % 2 == 0) {
            try {
                shape = new Circle(i);
            } catch (NegativeArgumentException e) {
				System.out.println("Negative argument: " + e.getArgument());
				i = -i;
                try {
                    shape = new Circle(i);
                } catch (NegativeArgumentException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
		else {
            try {
                shape = new Rectangle(i, 2 * i);
            } catch (NegativeArgumentException e) {
				System.out.println("Negative argument: " + e.getArgument());
				i = -i;
				try {
					shape = new Rectangle(i, 2 * i);
				} catch (NegativeArgumentException ex) {
					throw new RuntimeException(ex);
				}
            }
        }

		return shape;
	}
}
