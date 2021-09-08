package com.revature.app.collection;
import java.util.Stack;

import com.revature.app.objectclass.Person;

public class StackDemo {


	public static void main(String[] args) {
		Person person1 = new Person("John", 15 );
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Maria", 42);
		Person person6 = new Person("Maria", 13);
        //maintains insertion order
		//duplicate items
		Stack<Person> personStack = new Stack<>();
		personStack.push(person1);
		personStack.push(person2);
		personStack.push(person3);
		personStack.push(person4);
		personStack.push(person5);
		personStack.push(person6);
		
		System.out.println("Search: " + personStack.search(new Person("Stella", 32)));
		
		for(Person person : personStack) {
			System.out.println(person);
		}
		Person person = personStack.pop();
		System.out.println("pop: " + person);
		
		for(Person person11 : personStack) {
			System.out.println(person11);
		}
	}



	}
