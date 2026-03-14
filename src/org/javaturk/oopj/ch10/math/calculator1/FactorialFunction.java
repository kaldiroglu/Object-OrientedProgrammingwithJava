package org.javaturk.oopj.ch10.math.calculator1;

public class FactorialFunction implements MathFunction {

	@Override
	public String getName() {
		return "Factorial";
	}

	@Override
	public double calculate(double arg) {
		return calculateFactorial(arg);
	}

	private int calculateFactorial(double arg){
		int k = (int) arg;
		int factorial = 1;
		
		for(int i = 2; i <= k ; i++){
			factorial *= i;
			
		}
		return factorial;
	}
}
