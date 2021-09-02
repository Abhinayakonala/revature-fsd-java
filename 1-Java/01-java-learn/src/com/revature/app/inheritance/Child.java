package com.revature.app.inheritance;

public class Child extends Parent {
	//'super' keyword in the child is used to 
	//refer the parent class
 
	public Child(int age) {
		super(age);
	
	}
	public void childInstanceMethod() {
		System.out.println("childInstanceMethod()");
		System.out.println(age);
	}
	//Method Overriding
	public void instanceMethod() {
		//super.instanceMethod();
		System.out.println("child instanceMethod()");
		
	}
	
	public static void main(String[] args) {
		Child child = new Child(10);
		child.instanceMethod();
		//child.childInstanceMethod();
		
		//Runtime Polymorphism
		Parent parent = new Child(20);
		parent.instanceMethod();
		
		
	}
}
	
