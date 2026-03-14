package org.javaturk.oopj.ch10.math.calculator3;

public class LogFunction implements SingleArgMathFunction {
	private static String name = "Log";

	public String getName() {
		return name;
	}

	public double calculate(double arg) {
		return Math.log(arg);
	}
}
