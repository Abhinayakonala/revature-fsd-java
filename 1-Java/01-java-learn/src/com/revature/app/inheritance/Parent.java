package com.revature.app.inheritance;

public class Parent {
	
	//Protected
	// when Parent class is used in another class,age is private
	// when age is used in child class directly access the instance
	protected int age;
	 
	public Parent(int age) {
		System.out.println("Parent constructor");
		this.age = age;
	}

	public  void instanceMethod() {
		System.out.println("Parent instanceMethod()");

	}

}
