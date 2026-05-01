package org.javaturk.oopj.hw.ch13.fileProcessing;

public class FileSimulator {

    private boolean isOpen = false;

    public void openFile() {
        isOpen = true;
        System.out.println("File opened.");
    }

    public void processFile() throws FileProcessingException {
        System.out.println("Processing file...");
        throw new FileProcessingException("Unexpected content found during processing.");
    }

    public void closeFile() {
        if (isOpen) {
            isOpen = false;
            System.out.println("File closed.");
        } else {
            System.out.println("File was already closed.");
        }
    }
}
