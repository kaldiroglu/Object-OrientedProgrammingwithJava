package org.javaturk.oopj.ch13.finaly;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Java SE Tutorial example.
 */
public class CleanUpWithFinally {

	private static List<Integer> list = new ArrayList<>();
	private static final int SIZE = 20;

	public static void main(String[] args) {
		populateList();
		writeList1();
	}

	private static void populateList() {
		for (int i = 0; i < SIZE; i++) {
			list.add((int) (10 * i * Math.random()));
		}		
	}

	public static void writeList1() {
		PrintWriter out = null;
		System.out.println("Entered try statement");
		try {
			out = new PrintWriter(new FileWriter("/Users/akin/Desktop/OutFile.txt"));
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + list.get(i));
				if(i == 18)
					throw new IOException("Just trying something :)");
			}
			out.close();
			out = null;
		} catch (IOException e) {
			System.out.println("Problem when writing out to the file: " + e.getMessage());
		} finally { // For clean up!
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
				out = null;
			} else {
				System.out.println("PrintWriter not open");
			}
		}
	}
	
	public static void writeList2() {
		System.out.println("Entered try statement");
		try (PrintWriter out = new PrintWriter(new FileWriter("/Users/akin/Desktop/OutFile.txt"));){
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + list.get(i));
				if(i == 18)
					throw new IOException("Just trying something :)");
			}
			//out.close(); // No need for this too!
			//out = null; // Not assignable!
		} catch (IOException e) {
			System.out.println("Problem when writing out to the file: " + e.getMessage());
		} finally { // For clean up!
			// No need for this block!
			/*if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
				out = null;
			} else {
				System.out.println("PrintWriter not open");
			}*/
		}
	}
}
