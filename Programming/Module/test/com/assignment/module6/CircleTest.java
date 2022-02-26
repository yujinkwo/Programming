package com.assignment.module6;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

    @Test
    public void getAreaTest() {
        double radius = 4;
        double expected = radius * radius * Circle.PI;

        Circle circle = new Circle(radius);

        double actual = circle.getArea();

        assertEquals(expected, actual, 0);
    }
}