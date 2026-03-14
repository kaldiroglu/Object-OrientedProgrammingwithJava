package org.javaturk.oopj.ch13.ex;

import org.javaturk.oopj.util.ScannerUtil;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;


/**
 * Create file /Users/akin/Desktop/a1.txt and make it free to read and write. Actually don't do anything, it is readable and writable.
 * Create file /Users/akin/Desktop/a2.txt and make it non-readable by "chmod 000 a2.txt".
 */
public class ClosingResources {

    public static void main(String[] args) {
        String path = ScannerUtil.read("Please enter the path of the file to open:");
        File file = new File(path);
		openReadAndCloseFile(file);
    }

    private static void openReadAndCloseFile(File file) {
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            System.out.println("File opened!");
            int availableByteCount = in.available();
            System.out.println("Available byte count to read: " + availableByteCount);

            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

            in.close();
            System.out.println("\nFile closed!");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            System.out.println("Problem with opening the file: " + file);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
            if(in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println("IOException");
                    System.out.println("Problem with closing the file: " + file);
                    System.out.println("Message: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("\nIOException");
            System.out.println("Problem with the file: " + file);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
            if(in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println("IOException");
                    System.out.println("Problem with closing the file: " + file);
                    System.out.println("Message: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
