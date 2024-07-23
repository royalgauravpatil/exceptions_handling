package com.exceptions_handling;

public class RethrowExample {  
    public static void process() throws Exception {  
        try {  
            methodThatThrowsException();  
        } catch (Exception e) {  
            throw new Exception("Error processing", e);  
        }  
    }  
  
    public static void methodThatThrowsException() throws Exception {  
        throw new Exception("Original exception");  
    }  
  
    public static void main(String[] args) {  
        try {  
            process();  
        } catch (Exception e) {  
            System.err.println("Error: " + e.getMessage());  
            System.err.println("Cause: " + e.getCause().getMessage());  
            System.err.println("Stack Trace:");  
            e.printStackTrace(); 
        }  
    }  
}
