package com.assignment.module4;
import com.assignment.module3.Rotate;
import com.assignment.module3.TwoDShape;

public class Triangle extends TwoDShape implements Rotate {
    double side1, side2, side3;
    double degree;

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
        double s = (side1 + side2 + side3) / 2;
        double S = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        height = S / side1 * 2;
        width = side1;
        return height;
    }

    public double getArea() {
        return width * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", degree=" + degree +
                '}';
    }

    @Override
    public void rotate90() {

    }

    @Override
    public void rotate180() {

    }

    @Override
    public void rotate(double degree) {

    }
}