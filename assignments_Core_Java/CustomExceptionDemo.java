package assignments_Core_Java;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + (amount - balance) + " Rs. To perform this transaction.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }
}


public class CustomExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Amount of Balance : ");
		int bal = sc.nextInt();
        Account account = new Account(bal);
        System.out.print("Enter Amount you Want to Withdraw : ");
		int wit = sc.nextInt();
        int withdrawAmount = wit;

        try {
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
