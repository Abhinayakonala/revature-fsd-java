package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.form.CustomerRegistrationForm;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);

		addMenuItem("Register new Customer");
		addMenuItem("Login as Customer");
		addMenuItem("Login as Employee");
		addMenuItem("Exit");
	}

	@Override
	void handleAction() {
		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:
			CustomerRegistrationForm customerRegistrationForm = new CustomerRegistrationForm("Customer Registration Form");
			customerRegistrationForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
		case 2 :
			LoginForm loginForm = new LoginForm("Customer registration form");
			loginForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
			
		case 3 :
			System.out.println("Welcome Back!!!");
			break;
		case 4 : 
			System.out.println("Closing The Application");
			break;
		
		}

	}
}