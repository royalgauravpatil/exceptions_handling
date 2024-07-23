package com.exceptions_handling;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
import java.nio.file.Files;
import java.nio.file.Paths;

public class Checked_Exceptions {  
    public static void main(String[] args) {  
        String filePath = "C:\\Users\\Shree\\Documents\\gaurav.drawio";
        
        if (Files.exists(Paths.get(filePath))) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {  
                String line;  
                while ((line = reader.readLine()) != null) {  
                    System.out.println(line);  
                }  
            } catch (IOException e) {  
                System.err.println("Error reading file: " + e.getMessage());  
            }  
        } else {
            System.err.println("File does not exist: " + filePath);
        }
    }  
}  
