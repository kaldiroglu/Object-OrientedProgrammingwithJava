package org.javaturk.oopj.ch08.io;

import java.io.*;
import java.util.Date;

public class FileReaderWriterExample {

    static void main() throws IOException {
        String path = "src/org/javaturk/oopj/ch08/io/file.txt";

        // First write
        String text = "This is a text file.";
        Writer writer = new FileWriter(path);
        writer.write(text);
        writer.write("\n");
        writer.write(String.valueOf(new Date()));
        writer.close();

        // Then read it
        Reader reader = new FileReader(path);
        int c;
        while((c = reader.read()) != -1){
            System.out.print((char) c);
        }
        reader.close();
    }
}
