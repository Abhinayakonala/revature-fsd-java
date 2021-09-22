package com.revature.app.abstraction;

import com.revature.app.abstraction.AbstractClass;

public class ChildClass extends AbstractClass {
	
	public ChildClass(int age) {
		super(age);

	}
	
	//@Override
	public void abstractMethod() {
		System.out.println("Concrete abstractMethod() in child class");

	}
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass(10);
		childClass.abstractMethod();
	}

}
