package org.javaturk.oopj.ch13.ex;

import org.javaturk.oopj.util.ScannerUtil;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;


/**
 * Create file /Users/akin/Desktop/a1.txt and make it free to read and write. Actually don't do anything, it is readable and writable.
 * Create file /Users/akin/Desktop/a2.txt nad make it readonly by "chmod 400 a2.txt".
 */
public class ExceptionExample1 {

    public static void main(String[] args) {
        String path = ScannerUtil.read("Please enter the path of the file to open:");
        File file = new File(path);
//		openFile(file);
//        openWriteAndCloseFile(file);
		openReadAndCloseFile(file);
        System.out.println("End of main.");
    }

    /**
     * Just tries to open a file. It throws FileNotFoundException if there is a problem in finding or opening the file.
     * Try with following cases: An existing file and a non-existing file.
     *
     * @param file the file to be opened.
     */
    private static void openFile(File file) {
        // Open the file to write
        try {
            InputStream in = new FileInputStream(file);
            System.out.println("File opened!");
        } catch (FileNotFoundException e) {
            System.out.println("Problem with opening the file: " + file);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * It opens and then write into a file.
     * Try with following cases: An existing file, a non-existing file and a read-only file.
     *
     * @param file the file to be opened.
     */
    private static void openWriteAndCloseFile(File file) {
        try {
            // Open the file to write
            OutputStream out = new FileOutputStream(file); // FileNotFoundException
            System.out.println("File opened!");

            // Write date and some string into the file
            Date date = new Date();
            byte[] bytes1 = date.toString().getBytes(StandardCharsets.US_ASCII);
            out.write(bytes1); // IOException
            byte[] bytes2 = "\n".getBytes(StandardCharsets.US_ASCII);
            out.write(bytes2);
            String s = "Java Forever!Java Forever!Java Forever!Java Forever!Java Forever!Java Forever!";
            byte[] bytes3 = s.getBytes(StandardCharsets.US_ASCII);
            System.out.println("Writing into the file.");
            out.write(bytes3);
            out.write(bytes2);

            // And the close it.
            out.close();
            System.out.println("File closed!");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            System.out.println("Problem with opening the file: " + file);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException");
            System.out.println("Problem with the file: " + file);
            System.out.println("Message: " + e.getMessage());
            // e.printStackTrace();
        }
    }

    /**
     * It opens and then reads from a file.
     * Provide an existing file with some char content and try with following cases: run without and with reading after closing the file.
     *
     * @param file the file to be opened.
     */
    private static void openReadAndCloseFile(File file) {
        try {
            InputStream in = new FileInputStream(file);
            System.out.println("File opened!");
            int availableByteCount = in.available();
            System.out.println("Available byte count to read: " + availableByteCount);
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

//			BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
//			String line;
//			while((line = reader.readLine()) != null){
//				System.out.print(line);
//			}

            in.close();
            System.out.println("\nFile closed!");
            // Trying to read after the stream is closed.
            in.read();
//			reader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            System.out.println("Problem with opening the file: " + file);
            System.out.println("Message: " + e.getMessage());
            // e.printStackTrace();
        } catch (IOException e) {
            System.out.println("\nIOException");
            System.out.println("Problem with the file: " + file);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
