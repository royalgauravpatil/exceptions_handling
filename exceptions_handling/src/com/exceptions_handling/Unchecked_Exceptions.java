package com.exceptions_handling;

import java.util.Scanner;

public class Unchecked_Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        
        int div = 0;
        while (true) {
            System.out.print("Enter div: ");
            div = scanner.nextInt();
            if (div == 0) {
                System.err.println("Error: Division by zero is not allowed. Please enter a non-zero divisor.");
            } else {
                break;
            }
        }

        int result = divide(b, div);
        System.out.println("Result: " + result);
    }

    public static int divide(int b, int div) {
        return b / div;
        
    }
}

