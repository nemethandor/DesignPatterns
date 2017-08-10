package com.pattern.core.decorator;

import com.pattern.core.decorator.CarInterface;

public abstract class CarDecorator implements CarInterface {
	protected CarInterface decoratedCar;

	public CarDecorator(CarInterface decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	public void writeoutProperties() {
		decoratedCar.writeoutProperties();
	}
}
