package com.revature.bankapp.menu;

import java.util.Scanner;

public class TransactionMenu extends Menu {


	public TransactionMenu(String name) {
		super(name);
		
		addMenuItem("Withdrwal");
		addMenuItem("Deposit");
		addMenuItem("View Balance");
		addMenuItem("View Transaction Log");
		addMenuItem("Back");
	}
	

	

	@Override
	void handleAction() {
		Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("**** Transaction Menu ****");
            System.out.println(" 1. Withdraw");
            System.out.println(" 2. Deposit");
            System.out.println(" 3. Check Balance");
            System.out.println(" 4. EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = sc.nextInt();
            int withdraw;
			int balance = 0;
			int deposit;
			switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
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
                deposit = sc.nextInt();
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
	} 


