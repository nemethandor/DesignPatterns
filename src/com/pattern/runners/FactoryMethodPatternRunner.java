package com.pattern.runners;

import com.pattern.core.factorymethod.CarFactory;
import com.pattern.core.factorymethod.CarInterface;

public class FactoryMethodPatternRunner {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();

	    //get an object of Race Car and call its showYourSelf method.
	    CarInterface car1 = carFactory.getCar("RCAR");
	    car1.showYourself();

	    //get an object of Ambulance Car and call its showYourSelf method.
	    CarInterface car2 = carFactory.getCar("ACAR");
	    car2.showYourself();

	    //get an object of Truck and call its showYourSelf method.
	    CarInterface car3 = carFactory.getCar("TRUCK");
	    car3.showYourself();
	    
	  //get an object of Quad and call its showYourSelf method.
	    CarInterface car4 = carFactory.getCar("QUAD");
	    car4.showYourself();

	}

}
