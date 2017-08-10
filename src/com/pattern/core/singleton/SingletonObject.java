package com.pattern.core.singleton;

public class SingletonObject {
	// create an object of SingleObject
	private static SingletonObject instance = new SingletonObject();

	// make the constructor private so that this class cannot be
	// instantiated
	private SingletonObject() {
	}

	// Get the only object available
	public static SingletonObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Pumpeding!");
	}
	
	public void showYourName(){
		System.out.println("Pumped Gab�!");
	}
}
