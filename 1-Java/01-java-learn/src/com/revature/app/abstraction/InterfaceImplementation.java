package com.revature.app.abstraction;

public class InterfaceImplementation implements Interface {
	
	public void abstractmethod() {
		System.out.println("Interface implementation abstractmethod()");
		
	}
	
	public static void main(String[] args) {
		Interface interface1 = new InterfaceImplementation();
		interface1.abstractmethod();
	}

}
