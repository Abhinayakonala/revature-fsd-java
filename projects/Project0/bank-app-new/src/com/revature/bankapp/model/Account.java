package com.revature.bankapp.model;

import java.util.ArrayList;

public class Account {
	private long id;
	private long accountNumber;
	private String name;
	private String branch;
	private long balance;
	private long counter = 65654;
	private int idCounter;
	private ArrayList<String> transactionList;

	public Account(String name, String branch, long balance, ArrayList<String> transactionList) {
		super();
		this.name = name;
		this.branch = branch;
		this.balance = balance;
		this.transactionList = transactionList;
	}

	public static int incrementer(int idCounter) {
		idCounter = idCounter + 1;
		return idCounter;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long l) {
		this.balance = l;
	}

	public ArrayList<String> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(ArrayList<String> transactionList) {
		this.transactionList = transactionList;
	}

	public static ArrayList<String> createTransactionList() {
		ArrayList<String> list = new ArrayList<>();
		return list;
	}

	public static void addTransaction(String s) {
		Customer.getCurrentAccount().getTransactionList().add(s);
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", name=" + name + ", branch=" + branch
				+ ", balance=" + balance + "]";
	}

}