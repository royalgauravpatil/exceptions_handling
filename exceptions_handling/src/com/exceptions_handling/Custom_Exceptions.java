package com.exceptions_handling;

public class Custom_Exceptions {

    public static class InsufficientFundsException extends Exception {

		public InsufficientFundsException(String message) {
            super(message);
        }
    }

    private double balance;

    public Custom_Exceptions(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        Custom_Exceptions account = new Custom_Exceptions(100.00);

        try {
            account.withdraw(150.00); 
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

        try {
            account.withdraw(50.00); 
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }
}

