package org.javaturk.oopj.ch13.division;

import org.javaturk.oopj.util.ScannerUtil;

import java.io.*;

public class DivisionByZero5 {

	public static void main(String[] args) {
		String path = ScannerUtil.read("Please enter the path of the file to open:");
		File file = new File(path);

		System.out.println("in main(). Before calling divide()");

		try {
			InputStream in = new FileInputStream(file);
			System.out.println("File opened!");
			divide(20, 0);
			in.close();
			System.out.println("File closed!");
			divide(20, 0);
			System.out.println("in main(). Just after calling divide()\n");
		}
		catch (ArithmeticException | IOException e) {
			System.out.println("Problem with the division.");
			System.out.println("Message: " + e.getMessage());
//			if( e instanceof ArithmeticException)
//				divide(20, 10);
		}
//		catch (ArithmeticException | FileNotFoundException | IOException  e) {
//			System.out.println("Problem with the division.");
//			System.out.println("Message: " + e.getMessage());
//			divide(20, 10);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		System.out.println("in main(). After calling divide()\n");
	}
	
//	public static void main(String[] args) {
//		String path = ScannerUtil.read("Please enter the path of the file to open:");
//		File file = new File(path);
//
//		System.out.println("in main(). Before calling divide()");
//
//		try {
//			InputStream in = new FileInputStream(file);
//			System.out.println("File opened!");
//			in.close();
//			System.out.println("File closed!");
//			divide(20, 0);
//			System.out.println("in main(). Just after calling divide()\n");
//		} catch (ArithmeticException | FileNotFoundException | IOException e) {  // Can't do this.
//			System.out.println("Problem with the division.");
//			System.out.println("Message: " + e.getMessage());
//			divide(20, 10);
//		}
//		System.out.println("in main(). After calling divide()\n");
//	}

	public static void divide(int num1, int num2) {
		System.out.println("in divide() with arguments: " + num1 + " and " + num2);
		if (num2 == 0)
			throw new ArithmeticException("0'a bolemezsiniz.");
		else {
			int division = num1 / num2;
			System.out.println(num1 + "/" + num2 + " =" + division);
		}
	}
}
