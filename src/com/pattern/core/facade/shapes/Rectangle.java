package com.pattern.core.facade.shapes;

public class Rectangle implements ShapeInterface {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

}
