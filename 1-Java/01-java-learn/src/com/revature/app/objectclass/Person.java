package com.revature.app.objectclass;

public class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

	@Override
	public String toString() {
		
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
       Person otherPerson = (Person) o;
       System.out.println(this.name + " " + otherPerson.name);
	//return name.compareTo(otherPerson.name); //+ve -First object comes first; -ve - 2nd object
	   return age - otherPerson.age;
	}
	


}


