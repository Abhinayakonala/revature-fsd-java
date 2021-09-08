package com.revature.app.threads;

import java.util.List;
import java.util.ArrayList;


public class ThreadDemo extends Thread{
	//ArrayList is not thread safe
	//vector is thread safe
	public static List<String> threads = new ArrayList<>();
	
	public void run() {
		threads.add(getName());
		
		//System.out.println("Thread " + getName() + " is running");
	}

}
