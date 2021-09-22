package com.revature.bankapp.form;

import java.util.Scanner;

import com.revature.bankapp.model.DataManager;


public class CreateAccount  {
	private  String accountNumber;
	private  String name;
	private String accountType;
	private long balance;

	public CreateAccount(String accountNumber, String name, String accountType, long balance) {
	super();
	this.accountNumber = getAccountNumber ();
	this.name = getName();
	this.accountType = getAccountType();
	this.balance = getBalance();
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public String getName() {
		return name;
	}

	
	public String getAccountType() {
		return accountType;
	}

	public long getBalance() {
		return balance;
	}
	
	
	}
	/*public void accountData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		accountNumber = scanner.next();
		System.out.println("Enter Account Name: ");
		name = scanner.next();
		System.out.println("Enter Account Type");
		accountType = scanner.next();
		System.out.println("Enter Starting Balance");
		balance = scanner.nextLong();
		
		System.out.println("Account Created Successfully");
		

	}*/


	
	