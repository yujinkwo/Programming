package com.assignment.module6;

public abstract class TwoDShape {
    public double width;
    public double height;
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
    public TwoDShape() {
        colour = Colour.NONE;
    }

    public abstract double getArea();
}
