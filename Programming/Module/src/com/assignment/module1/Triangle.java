package com.assignment.module1;

public class Triangle extends TwoDShape{
    double side1, side2, side3;
    public Triangle(double width, double height) {
        super(width, height);
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        heronHeight();
    }

    private double heronHeight() {
        double s = (side1+side2+side3)/2;
        double S = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        height = S / side1 * 2;
        width = side1;
        return height;
    }
    public double getArea() {
        return super.getArea();
    }
}

