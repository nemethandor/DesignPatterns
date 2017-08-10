package com.pattern.runners;

import com.pattern.core.facade.cars.CarMakerFacade;

public class FacadePatternRunner {

    public static void main(String[] args) {
        // ShapeMakerFacade shapeMaker = new ShapeMakerFacade();

        // shapeMaker.drawCircle();
        // shapeMaker.drawRectangle();
        // shapeMaker.drawSquare();

        // shapeMaker.drawAll();

        CarMakerFacade carMakerFacade = new CarMakerFacade();

        carMakerFacade.mindenkiMegy();
    }

}
