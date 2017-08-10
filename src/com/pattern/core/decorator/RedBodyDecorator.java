package com.pattern.core.decorator;


public class RedBodyDecorator extends CarDecorator {

	   public RedBodyDecorator(CarInterface decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void writeoutProperties() {
	      decoratedCar.writeoutProperties();	       
	      setRedBody(decoratedCar);
	   }

	   private void setRedBody(CarInterface decoratedShape){
	      System.out.println("Body Color: Red");
	   }
	}
