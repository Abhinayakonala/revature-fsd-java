package com.revature.app.objectclass;
import java.io.Serializable;

public class Person implements Comparable, Serializable /*marker interface*/{
	private static long counter = 0;
	private long id;
	private String name;
	private int age;
	
	public Person(int age, String name ) {
		super();
		counter++;
		this.id = counter;
		this.name = name;
		this.age = age;
		//System.out.println(toString());
		}
	
	
	public Person(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Long getId() {
		
		return id;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println(toString());
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		System.out.println("Person HashCode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Person,equals() called");
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
       Person otherPerson = (Person) o;
       System.out.println(this.name + " " + otherPerson.name);
	//return name.compareTo(otherPerson.name); //+ve -First object comes first; -ve - 2nd object
	   return age - otherPerson.age;
	}

}


