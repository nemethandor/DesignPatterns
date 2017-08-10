package com.pattern.runners;

import com.pattern.core.decorator.Audi;
import com.pattern.core.decorator.Bmw;
import com.pattern.core.decorator.CarInterface;
import com.pattern.core.decorator.RedBodyDecorator;
import com.pattern.core.decorator.SpeedDecorator;
import com.pattern.core.decorator.Trabant;

public class DecoratorPatternRunner {

	public static void main(String[] args) {
		CarInterface audi = new Audi();
		CarInterface redAudi = new RedBodyDecorator(new Audi());
		CarInterface redBmw = new RedBodyDecorator(new Bmw());
		CarInterface speedyBmw = new SpeedDecorator(new Bmw());
		CarInterface redSpeedyAudi = new SpeedDecorator(new RedBodyDecorator(new Audi()));
		CarInterface redSpeedyTrabant = new SpeedDecorator(new RedBodyDecorator(new Trabant()));

		System.out.println("Audi with normal body");
		audi.writeoutProperties();

		System.out.println("\nAudi with red body");
		redAudi.writeoutProperties();

		System.out.println("\nBmw with red body");
		redBmw.writeoutProperties();
		
		System.out.println("\nBmw with speed");
		speedyBmw.writeoutProperties();
		
		System.out.println("\nred Audi with speed");
		redSpeedyAudi.writeoutProperties();
		
		System.out.println("\nred Trabant with speed");
		redSpeedyTrabant.writeoutProperties();

	}

}
