package org.javaturk.oopj.ch10.math.calculator1;

public class SinFunction implements MathFunction {
	
	private static String name = "Sin";

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}
}
