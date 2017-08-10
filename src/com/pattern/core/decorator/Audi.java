package com.pattern.core.decorator;

public class Audi implements CarInterface {
	
	@Override
	public void writeoutProperties() {
		System.out.println("Type: Audi");
	}
}
