package com.pattern.runners;

import com.pattern.core.facade.ShapeMakerFacade;

public class FacadePatternRunner {

	public static void main(String[] args) {
		ShapeMakerFacade shapeMaker = new ShapeMakerFacade();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

		// shapeMaker.drawAll();
	}

}
