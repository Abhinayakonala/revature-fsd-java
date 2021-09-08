package com.revature.app.stream;

import java.util.function.Consumer;

public class LambdaDemo {
	//functional interface should have a single abstract method(SAM)

	public static void main(String[] args) {
		// lambda expressions are shorter for function
		//(parameter)->(function-body)
		//passing function itself as a parameter
		//Lambda expression introduced in JDK 8
		CustomFunctionalInterface<String> customInterface = (name1, name2) -> System.out.printf(name1, name2);
		customInterface.accept("Hello","World");
	}
	public void print(String name) {
		System.out.println(name); 
	}

}
