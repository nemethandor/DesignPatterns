package com.pattern.core.facade;

public class ShapeMakerFacade {
	private ShapeInterface circle;
	private ShapeInterface rectangle;
	private ShapeInterface square;

	public ShapeMakerFacade() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawAll(){
		circle.draw();
		rectangle.draw();
		square.draw();
	}
	
	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
