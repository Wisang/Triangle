package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import production.Triangle;

public class TrinagleTest {
    private static final int INVALID = -1;
    private static final int GENERAL = 1;
    private static final int ISOCELES = 2;
    private static final int EQUILATERAL = 3;

    @Test
    void TriangleShapeTest() {
        assertEquals(EQUILATERAL,Triangle.getShape(3,3,3));
        assertEquals(ISOCELES,Triangle.getShape(3,3,4));
        assertEquals(GENERAL,Triangle.getShape(3,4,5));
        assertEquals(INVALID,Triangle.getShape(3,3,6));
    }
}
