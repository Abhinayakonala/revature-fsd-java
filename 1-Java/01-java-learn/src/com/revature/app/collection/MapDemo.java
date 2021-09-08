package com.revature.app.collection; 
import java.util.Map;
import java.util.Set;

import com.revature.app.objectclass.Person;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo {

	public static void main(String[] args) {
		Person person1 = new Person("John", 15 );
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Maria", 42);
		Person person6 = new Person("Mark", 42);
		Map<Long, Person> personMap = new HashMap();
		personMap.put(person1.getId(),person1);
		personMap.put(person2.getId(),person2);
		personMap.put(person3.getId(),person3);
		personMap.put(person4.getId(),person4);
		personMap.put(person5.getId(),person5);
		personMap.put(person6.getId(),person6);
		for (Long id: personMap.keySet()) {
			System.out.println("Person:" + personMap.get(id));
		}
		personMap.remove(1L);
		System.out.println("\n Map after deletion");
		for (Long id: personMap.keySet()) {
			System.out.println("Person:" + personMap.get(id));
		}
		
		
		

	}

}
