package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String passowrd;
	private static long counter = 0;
	private ArrayList<Account> accountList;
	private static int choice;

	private static Account currentAccount;

	public static Account getCurrentAccount() {
		return currentAccount;
	}

	public static void setCurrentAccount(Account currentAccount) {
		Customer.currentAccount = currentAccount;
	}

	static {

	}

	public Customer(String firstName, String lastName, String email, String passowrd, ArrayList<Account> accountList) {
		super();
		counter++;
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passowrd = passowrd;
		this.accountList = accountList;

	}

	public static void addAccount(Account account) {
		DataManager.getCurrentCustomer().getAccountList().add(account);
	}

	public static ArrayList<Account> getAccountList() {
		return DataManager.getCurrentCustomer().accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public static void selectAccount() {
		System.out.print("Select account to perform transaction : ");
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		Customer.setCurrentAccount(DataManager.getCurrentCustomer().getAccountList().get(choice - 1));
		System.out.println(Customer.getCurrentAccount());
		if (choice <= 0 && choice > DataManager.getCurrentCustomer().getAccountList().size()) {
			System.out.println("Choose valid Account");
			selectAccount();
		}

		// performTransaction();
	}
	
	   /* public static void main(String args[] )
	    { 
	        int balance = 5000, withdraw, deposit;
	        Scanner s = new Scanner(System.in);
	        while(true)
	        {
	            System.out.println("Automated Teller Machine");
	            System.out.println("Choose 1 for Withdraw");
	            System.out.println("Choose 2 for Deposit");
	            System.out.println("Choose 3 for Check Balance");
	            System.out.println("Choose 4 for EXIT");
	            System.out.print("Choose the operation you want to perform:");
	            int n = s.nextInt();
	            switch(n)
	            {
	                case 1:
	                System.out.print("Enter money to be withdrawn:");
	                withdraw = s.nextInt();
	                if(balance >= withdraw)
	                {
	                    balance = balance - withdraw;
	                    System.out.println("Please collect your money");
	                }
	                else
	                {
	                    System.out.println("Insufficient Balance");
	                }
	                System.out.println("");
	                break;
	 
	                case 2:
	                System.out.print("Enter money to be deposited:");
	                deposit = s.nextInt();
	                balance = balance + deposit;
	                System.out.println("Your Money has been successfully depsited");
	                System.out.println("");
	                break;
	 
	                case 3:
	                System.out.println("Balance : "+balance);
	                System.out.println("");
	                break;
	 
	                case 4:
	                System.exit(0);
	            }
	        }
	    }
	}*/
	public static void withdrawal() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to withdraw : ");
		long withdrawalAmount = scanner.nextLong();
		if (withdrawalAmount <= 0) {
			System.out.println("You cannot withdraw negative amount");
		} else if (DataManager.getCurrentCustomer().getAccountList().get(choice - 1).getBalance() >= withdrawalAmount) {
			DataManager.getCurrentCustomer().getAccountList().get(choice - 1).setBalance(
					DataManager.getCurrentCustomer().getAccountList().get(choice - 1).getBalance() - withdrawalAmount);
			System.out.println(
					" Balance : " + DataManager.getCurrentCustomer().getAccountList().get(choice - 1).getBalance());
			Account.addTransaction(withdrawalAmount + "  is debited from your account.");
		} else {
			System.out.println("Insuuficient Funds");
			System.out.println(
					" Balance : " + DataManager.getCurrentCustomer().getAccountList().get(choice - 1).getBalance());
		}
	}

//

	public static void getAccountBalance() {
		System.out
				.println("Balance :" + DataManager.getCurrentCustomer().getAccountList().get(choice - 1).getBalance());
	}

	public static void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		long depositAmount = scanner.nextLong();
		DataManager.getCurrentCustomer().getAccountList().get(choice - 1).setBalance(
				DataManager.getCurrentCustomer().getAccountList().get(choice - 1).getBalance() + depositAmount);
		System.out
				.println("Balance :" + DataManager.getCurrentCustomer().getAccountList().get(choice - 1).getBalance());
		Account.addTransaction(depositAmount + "  is credited to your account");
	}

	public static ArrayList<Account> createAccountList() {
		ArrayList<Account> list = new ArrayList<>();
		return list;
	}

}