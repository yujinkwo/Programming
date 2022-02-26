package com.assignment.module1;

public class TwoDShape {
    public double width;
    public double height;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {
    }

    public double getArea() {
        return width * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}


