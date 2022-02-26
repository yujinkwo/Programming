package com.assignment.module2;

public abstract class TwoDShape {
    double width, height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public TwoDShape() {
    }
    public abstract double getArea();

}
