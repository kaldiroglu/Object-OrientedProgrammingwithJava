package org.javaturk.oopj.ch04.sealing.shape;

/**
 * cd "/Users/akin/Development/Java/Eclipse/202103 EE/workspace/Java SE WS/Java SE New Features/src/org/javaturk/newFeatures/java17/sealed/shape"
 * javac -d "/Users/akin/Development/Java/Eclipse/202103 EE/workspace/Java SE WS/Java SE New Features/bin" *.java
 * 
 * cd "/Users/akin/Development/Java/Eclipse/202103 EE/workspace/Java SE WS/Java SE New Features/bin"
 * java org.javaturk.newFeatures.java17.sealed.shape.InstanceofTest
 * @author akin
 *
 */
public class InstanceofTest {

	public static void main(String[] args) {
		Shape shape = getShape();
		
		if (shape instanceof Circle)
			System.out.println("It is a circle: " + shape.getName());
		else if (shape instanceof Rectangle)
			System.out.println("It is a rectangle: " + shape.getName());
		else if (shape instanceof FilledSquare)
			System.out.println("It is a filled square: " + shape.getName());
		else if (shape instanceof Square)
			System.out.println("It is a square: " + shape.getName());
	}

	private static Shape getShape() {
		return new FilledSquare("Blue Square", 10, "Blue");
	}

}
