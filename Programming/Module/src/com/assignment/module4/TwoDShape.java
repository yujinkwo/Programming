package com.assignment.module4;

public abstract class TwoDShape {
    double width, height;
    Colour colour;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public TwoDShape (){}
    public abstract double getArea();
}
