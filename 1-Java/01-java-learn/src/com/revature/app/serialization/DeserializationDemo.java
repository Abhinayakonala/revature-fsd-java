package com.revature.app.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.revature.app.objectclass.Person;

import java.util.ArrayList;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
	
		try {
		FileInputStream fileOutputStream = new FileInputStream("E:\\person.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
		
		List<Person> personList = (ArrayList) objectInputStream.readObject();
		
		personList.forEach(System.out::println);
		
		objectInputStream.close();
		fileOutputStream.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
 
		} catch (ClassNotFoundException e) {
		}
	}
}
