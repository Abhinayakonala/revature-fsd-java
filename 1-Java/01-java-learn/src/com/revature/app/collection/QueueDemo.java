package com.revature.app.collection;

import java.util.PriorityQueue;
import java.util.Queue;

import com.revature.app.objectclass.Person;

public class QueueDemo {

	public static void main(String[] args) {
			
			Person person1 = new Person("John", 15 );
			Person person2 = new Person("Smith", 25);
			Person person3 = new Person("Stella", 32);
			Person person4 = new Person("Maria", 42);
			Person person5 = new Person("Maria", 42);
			Person person6 = new Person("Maria", 13);
	        //maintains insertion order
			//duplicate items
			Queue<Person> personQueue = new PriorityQueue<>();
			personQueue.add(person1);
			personQueue.add(person2);
			personQueue.add(person3);
			personQueue.add(person4);
			for(Person person : personQueue) {
				System.out.println(person);
			}
			Person person = personQueue.poll();
			System.out.println("Person polled: " + person);
			
			for(Person person11 : personQueue) 
			{
				System.out.println(person11);
			}

		}

	}
