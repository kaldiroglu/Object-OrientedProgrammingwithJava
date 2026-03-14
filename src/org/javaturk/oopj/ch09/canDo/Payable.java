package org.javaturk.oopj.ch09.canDo;

public interface Payable {
	
	double calculatePrice();
	
	double calculateTax();
	
	void pay(double price);

}
