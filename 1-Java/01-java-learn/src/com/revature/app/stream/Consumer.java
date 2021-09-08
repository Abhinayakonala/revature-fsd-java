package com.revature.app.stream;

public class Consumer {
	//functional interface should have a single abstract method(SAM)

		public static void main(String[] args) {
			// lambda expressions are shorter for function
			//(parameter)->(function-body)
			//passing function itself as a parameter
			//Lambda expression introduced in JDK 8
			CustomFunctionalInterface<String> customInterface = (name1,name2) -> System.out.println(name1);
			customInterface.accept("Hello", "World");
		}
		public void print(String name) {
			System.out.println(name);
		}
}

	 
		