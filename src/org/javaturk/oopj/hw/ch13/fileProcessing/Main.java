package org.javaturk.oopj.hw.ch13.fileProcessing;

public class Main {

    public static void main(String[] args) {
        FileSimulator simulator = new FileSimulator();

        try {
            simulator.openFile();
            simulator.processFile();
        } catch (FileProcessingException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            simulator.closeFile();
        }

        System.out.println("Program continues normally after handling.");
    }
}