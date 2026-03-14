package org.javaturk.oopj.ch11.defaultMethods;

public class TestDefaultMethod {

	public static void main(String[] args) {
		Printable printable = new Document();
		printable.print();
		printable.view();
		printable.format();
	}
}
