package com.revature.bankapp.main;

import java.util.Scanner;

import com.revature.bankapp.menu.MainMenu;

public class BankApp {
	

		public static void main(String[] args) {
			MainMenu menu = new MainMenu("Main Menu");
			menu.displayMenuAndCaptureSelection();
		}

		 public static Scanner getScanner() {
			// TODO Auto-generated method stub
			return null;
		}

	}


