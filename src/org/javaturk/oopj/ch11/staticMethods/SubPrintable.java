
package org.javaturk.oopj.ch11.staticMethods;

public interface SubPrintable extends Printable {

//	@Override
	static void startPrinting(){
		System.out.println("SubPrinting has been started.");
//		Printable.startPrinting();
	}
}
