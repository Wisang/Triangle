package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import production.Triangle;

public class TrinagleTest {
    @Test
    void TriangleShapeTest() {
        assertEquals(3,Triangle.getShape(3,3,3));
        assertEquals(2,Triangle.getShape(3,3,4));
        assertEquals(1,Triangle.getShape(3,4,5));
        assertEquals(-1,Triangle.getShape(3,3,6));
    }
}
