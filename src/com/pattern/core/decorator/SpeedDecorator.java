package com.pattern.core.decorator;

public class SpeedDecorator extends CarDecorator{
	
	public SpeedDecorator(CarInterface decoratedShape){
		super(decoratedShape);
	}
	
	@Override
	public void writeoutProperties(){
		decoratedCar.writeoutProperties();
		setSpeed(decoratedCar);
		
	}
	
	private void setSpeed(CarInterface decoratedShape){
		System.out.println("Speed: 200");
	}

}
