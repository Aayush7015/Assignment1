package Assignment1;

import java.util.Scanner;

public class console_based_bank_management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter name");
	        String name = sc.nextLine();
	        System.out.println("Enter account number");
	        int accNo = sc.nextInt();
	        System.out.println("Enter initial balance");
	        double bal = sc.nextDouble(); 
	        BankAccount account = new BankAccount(name, accNo, bal);

	        int choice;
	        do {
	            System.out.println("1 Deposit");
	            System.out.println("2 Withdraw");
	            System.out.println("3 Check Balance");
	            System.out.println("4 Account Details");
	            System.out.println("0 Exit");
	            choice = sc.nextInt();
	            try {
	                switch (choice) {
	                    case 1:
	                        System.out.println("Enter amount");
	                        account.deposit(sc.nextDouble());
	                        break;
	                    case 2:
	                        System.out.println("Enter amount");
	                        account.withdraw(sc.nextDouble());
	                        break;
	                    case 3:
	                        account.checkBalance();
	                        break;
	                    case 4:
	                        account.displayDetails();
	                        break;
	                    case 0:
	                        System.out.println("Thank you");
	                        break;
	                    default:
	                        System.out.println("Invalid choice");
	                }
	            } catch (Exception e) {
	                System.out.println("Invalid transaction");
	            }

	        } while (choice != 0);
	    }
	}
class BankAccount {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        balance += amount;
        System.out.println("Amount deposited");
    }
    void withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
        System.out.println("Amount withdrawn");
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
