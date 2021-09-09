package com.revature.app.string;

public class MutableStringDemo {

	public static void main(String[] args) {
		//String is mutable
		//StringBuffer and StringBuilder
		//StringBuffer and StringBuilder-immutable
		//StringBuffer is thread safe
		//StrinBuilder is not thread safe
		String name = "John";
		System.out.println();
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);

	}

}
