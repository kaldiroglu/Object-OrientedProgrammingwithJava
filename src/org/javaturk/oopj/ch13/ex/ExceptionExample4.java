package org.javaturk.oopj.ch13.ex;

import org.javaturk.oopj.util.ScannerUtil;

import java.io.*;

/**
 * Example input: /Users/akin/derby.log
 * 
 * @author akin
 *
 */
public class ExceptionExample4 {

	public static void main(String[] args) {
		String path = ScannerUtil.read("Please enter the path of the file to open:");
		File file = new File(path);

		try {
			openAndCloseFile1(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		
		try {
			openAndCloseFile1(file);
		} 
		catch (Exception e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		
		try {
			openAndCloseFile2(file);
		} catch (IOException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		
		try {
			openAndCloseFile3(file);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		
		try {
			openAndCloseFile4(file);
		} catch (Throwable e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}

//		Can't do this!
//		try {
//			openAndCloseFile4(file);
//		} catch (IOException e) {
//			System.out.println(e.getClass().getName());
//			System.out.println("Problem with opening the file: " + path);
//			System.out.println("Message: " + e.getMessage());
//		}
	}
	
	private static void openAndCloseFile1(File path) throws IOException, FileNotFoundException {
		InputStream in = new FileInputStream(path);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}

	
	private static void openAndCloseFile2(File path) throws IOException {
		InputStream in = new FileInputStream(path);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}

	// Bad practice, don't do this!
	private static void openAndCloseFile3(File path) throws Exception {
		InputStream in = new FileInputStream(path);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}

	// Worst practice, don't do this!
	private static void openAndCloseFile4(File path) throws Throwable {
		InputStream in = new FileInputStream(path);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}


	/**
	 * Can't declare an exception type that is not the parent type of the actually thrown object!
	 * @param path
	 * @throws ArithmeticException
	 */
//	private static void openAndCloseFile4(String path) throws ArithmeticException {
//		File file = new File(path);
//		InputStream in = new FileInputStream(file);
//		System.out.println("File opened!");
//		in.close();
//		System.out.println("File closed!");
//	}

	/**
	 * Can't declare an exception type that is not the parent type of the actually thrown object!
	 * @param path
	 * @throws ArithmeticException
	 */
	private static void openAndCloseFile5(String path) throws ArithmeticException, IOException {
		File file = new File(path);
		InputStream in = new FileInputStream(file);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}
}
