package com.revature.app.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.revature.app.objectclass.Person;



public class ListObjectDemo {

	public static void main(String[] args) {
		Person person1 = new Person("John", 15 );
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Maria", 42);
		Person person6 = new Person("Maria", 13);
		
		//maintains insertion order
		//duplicate items
		List<Person> personList = new ArrayList<>();

		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
		
		Collections.sort(personList);
		for(Person person : personList) {
			System.out.println(person);
		}
        System.out.println("Display using Iterator");
		
		Iterator<Person> iterator = personList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
