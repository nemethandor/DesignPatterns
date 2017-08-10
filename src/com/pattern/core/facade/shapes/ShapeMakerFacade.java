package com.pattern.core.facade.shapes;

public class ShapeMakerFacade {
    private ShapeInterface circle;
    private ShapeInterface rectangle;
    private ShapeInterface square;
    private ShapeInterface diamond;

    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        diamond = new Diamond();
    }

    public void drawAll() {
        circle.draw();
        rectangle.draw();
        square.draw();
        diamond.draw();
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

    public void drawDiamond() {
        diamond.draw();
    }
}
