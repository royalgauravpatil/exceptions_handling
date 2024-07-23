package com.exceptions_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatch_Block {
    public static void main(String[] args) {
        try {
            processFile("C:\\Users\\Shree\\Documents\\gaurav.drawio");
        } catch (IOException | IllegalArgumentException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }

    public static void processFile(String fileName) throws IOException, IllegalArgumentException {
        if (fileName == null) {
            throw new IllegalArgumentException("File name cannot be null");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        } catch (IOException e) {
            throw e;
        }
    }
}
