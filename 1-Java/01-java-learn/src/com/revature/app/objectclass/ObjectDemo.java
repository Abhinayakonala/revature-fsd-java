package com.revature.app.objectclass;

public class ObjectDemo {
	@Override
	public String toString() {
		System.out.println("Inside objectDemo toString()");
		return super.toString();
	}

	public static void main(String[] args) {
		
		ObjectDemo objectDemo = new ObjectDemo();
		System.out.println(objectDemo);
	}
	}
