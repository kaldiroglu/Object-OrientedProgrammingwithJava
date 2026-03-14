package org.javaturk.oopj.ch13.ex;

import org.javaturk.oopj.util.ScannerUtil;

import java.io.*;

public class ExceptionExample2 {

	public static void main(String[] args) {
		String path = ScannerUtil.read("Please enter the path of the file to open:");
		File file = new File(path);
		try {
			openReadAndCloseFile(file);
		} catch (IOException e) {
			System.out.println("IOException");
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void openReadAndCloseFile(File file) throws IOException {
		try {
			InputStream in = new FileInputStream(file);
			System.out.println("File opened!");
			int availableByteCount = in.available();
			System.out.println("Available byte count to read: " + availableByteCount);
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}

			in.close();
			System.out.println("\nFile closed!");
			// Trying to read after the stream is closed.
			in.read();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			System.out.println("Problem with opening the file: " + file);
			System.out.println("Message: " + e.getMessage());
			// e.printStackTrace();
		}
	}
}
