package org.javaturk.oopj.ch09.canDo;

public class Product implements Payable{

	@Override
	public double calculatePrice() {
		return 10;
	}

	@Override
	public double calculateTax() {
		return 1;
	}

	@Override
	public void pay(double price) {
		System.out.println("Product is paid.");
	}
}
