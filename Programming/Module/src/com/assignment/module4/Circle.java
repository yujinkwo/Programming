package com.assignment.module4;

public class Circle extends TwoDShape {
    public final double PI = 3.141592;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}