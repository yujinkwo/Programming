package com.assignment.module6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void heronHeight() {
        double expected = 3.4641016151377544;
        Triangle triangle = new Triangle(4, 4, 4);

        double actual = triangle.heronHeight();

        assertEquals(expected, actual, 0);
    }

    @Test
    public void getAreaTest_width_height() {
        double expected = 5;

        Triangle triangle = new Triangle(2, 5);

        double actual = triangle.getArea();

        assertEquals(expected, actual, 0);
    }

    @Test
    public void getAreaTest_side() {
        double expected = 6;

        Triangle triangle = new Triangle(3, 4, 5);

        double actual = triangle.getArea();

        assertEquals(expected, actual, 0);
    }
}