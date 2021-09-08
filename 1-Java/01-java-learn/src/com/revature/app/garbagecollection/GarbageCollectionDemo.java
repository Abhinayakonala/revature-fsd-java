package com.revature.app.garbagecollection;

import com.revature.app.objectclass.Person;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		Person person = new Person(15, "john");
		person = null;
		
		Person person1 = new Person(15, "john");
		Person person2 = new Person(25, "Smith");
		person1 = person2;
		
		for(int i = 0; i < 10; i++) {
			Person person3 = new Person(32, "Stella");
		}
		System.gc();
	}

	

}
