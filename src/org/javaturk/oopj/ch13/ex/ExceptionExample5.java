package org.javaturk.oopj.ch13.ex;

import org.javaturk.oopj.util.ScannerUtil;

import java.io.*;


/**
 * 
 * @author akin
 *
 */
public class ExceptionExample5 {
	
//	public static void main(String[] args) {
//		String path = ScannerUtil.read("Please enter the path of the file to open:");
//		try {
//			openAndCloseFile1(path);
//		} catch (Exception e) {
//			System.out.println("Problem : " + path);
//			System.out.println("Message: " + e.getMessage());
//			e.printStackTrace();
//		}catch (IOException e) {
//			System.out.println("Problem with closing the file: " + path);
//			System.out.println("Message: " + e.getMessage());
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			System.out.println("Problem with opening the file: " + path);
//			System.out.println("Message: " + e.getMessage());
//			e.printStackTrace();
//		}
//	}
	
	public static void main2(String[] args) {
		String path = ScannerUtil.read("Please enter the path of the file to open:");
		try {
			openAndCloseFile2(path);
		} catch (FileNotFoundException e) {
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	private static void openAndCloseFile1(String path) throws IOException, FileNotFoundException {
		File file = new File(path);
		InputStream in = new FileInputStream(file);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}
	
	private static void openAndCloseFile2(String path) throws FileNotFoundException, IOException {
		File file = new File(path);
		InputStream in = new FileInputStream(file);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}
}
