package org.javaturk.oopj.ch13.finaly;

import java.io.*;

public class TryWithoutCatch {

	public static void main(String[] args) {
		try {
			trySomething();
			System.out.println("in main");
		} catch (IOException e) {
			System.out.println("in catch()");
			System.out.println(e.getMessage());
		}
		
//		trySomethingElse();
	}

	public static void trySomething() throws IOException {
		System.out.println("In trySomething()");
		InputStream is = null;
		try {
			System.out.println("In try");
			is = new FileInputStream(new File("/Users/akin/Desktop/aa.txt"));
			//....
			is.close();
		} finally {
			System.out.println("In finally");
			try {
				if(is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void trySomethingElse() {
		System.out.println("In trySomethingElse()");
		InputStream is = null;
		try {
			try {
				is = new FileInputStream(new File(""));
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		} finally {
			System.out.println("in finally");
			try {
				if(is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
