package com.revature.bankapp.model;
import java.util.List;

import com.revature.bankapp.form.CreateAccount;

public class Customer {
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	//private List<Account> accountList;
	
	private static long counter = 0;
	public static  List<CreateAccount> accountList;
	 public Customer(String firstName, String lastName, String email, String password) {
		super();
		counter++;
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
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

	public String getPassword() {
		return password;
	}

	public static String getAccountList() {
		// TODO Auto-generated method stub
		return getAccountList();
	}


}
