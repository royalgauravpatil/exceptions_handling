package com.exceptions_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionChaining {

    static class FileProcessingException extends Exception {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public FileProcessingException(String message) {
            super(message);
        }

        public FileProcessingException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public void processFile(String filePath) throws FileProcessingException {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file); 
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new FileProcessingException("Failed to process file: " + filePath, e);
        } catch (IOException e) {
            throw new FileProcessingException("IO error occurred while processing file: " + filePath, e);
        }
    }

    public static void main(String[] args) {
        ExceptionChaining demo = new ExceptionChaining();
        String filePath = "C:\\Users\\Shree\\Documents\\dirve show.txt"; 
        
        try {
            demo.processFile(filePath);
        } catch (FileProcessingException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}
