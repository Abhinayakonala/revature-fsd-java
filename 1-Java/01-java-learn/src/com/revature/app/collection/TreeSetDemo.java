package com.revature.app.collection;

import java.util.Set;
import java.util.TreeSet;

import com.revature.app.objectclass.Person;

public class TreeSetDemo {

	public static void main(String[] args) {
		Person person1 = new Person("John", 15 );
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Maria", 42);
		Person person6 = new Person("Maria", 13);
		
        //does not retain insertion order
		//not allow duplicate items
	    Set<Person> personSet = new TreeSet<>();
	 
		personSet.add(person1);
	    personSet.add(person2);
	    personSet.add(person3);
	    personSet.add(person4);
	    personSet.add(person5);
	    personSet.add(person6);
		

		for(Person person : personSet ) {
			System.out.println(person);
		}
	}
}
