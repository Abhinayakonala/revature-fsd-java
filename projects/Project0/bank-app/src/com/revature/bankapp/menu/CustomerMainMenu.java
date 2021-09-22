package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.form.ViewAccount;
import com.revature.bankapp.model.DataManager;

public class CustomerMainMenu extends Menu {

	public CustomerMainMenu(String name) {
		super(name);
		addMenuItem("Create Account");
		addMenuItem("View Accounts");
		addMenuItem("Logout");
	}
	

	@Override
	void handleAction() {
		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:
		Scanner scanner1 = new Scanner(System.in);	
		
		System.out.println("Enter Account Number:");
		String accountNumber  = scanner1.next();
		System.out.println("Enter Account Name: ");
		name = scanner1.next();
		System.out.println("Enter Account Type");
		String a = scanner1.next();
		System.out.println("Enter Starting Balance");
		long balance = scanner1.nextLong();
		
		System.out.println("Account Created Successfully");
		displayMenuAndCaptureSelection();
		break;
		
		case 2:
			System.out.println("These are your accounts");
			ViewAccount vc = new ViewAccount("viewAccount");
			vc.captureDataAndPerformAction();
			
			
		   break;
		case 3:
			System.out.println("Logout");
			break;
	
		}

	}
}


