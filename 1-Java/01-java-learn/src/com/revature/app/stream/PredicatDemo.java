package com.revature.app.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.app.objectclass.Person;

public class PredicatDemo {

	public static void main(String[] args) {
		Person person1 = new Person(1,"john",15);
		Person person2 = new Person(2,"smith", 25);
		Person person3 = new Person(3,"Stella", 32);
		Person person4 = new Person(4,"Maria", 42);
		Person person5 = new Person(5,"Janet", 42);
		
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
		
		List<Person> votingEligiblePersonList = new ArrayList();
		for (Person person : personList) {
			if (person.getAge() >= 18) {
				votingEligiblePersonList.add(person);
				
			}
		}
		votingEligiblePersonList.forEach(System.out::println);
		System.out.println("\n Data filtered using stream api:");
		List<Person> eligiblePersonList = personList.stream()
		.filter(e -> e.getAge() >= 18).collect(Collectors.toList());
		eligiblePersonList.forEach(System.out::println);
	}

}
