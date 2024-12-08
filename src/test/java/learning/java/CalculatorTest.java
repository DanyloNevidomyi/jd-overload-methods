package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd_TwoIntegers() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.add(5, 10));
    }

    @Test
    void testAdd_ThreeIntegers() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.add(5, 10, 15));
    }

    @Test
    void testAdd_Doubles() {
        Calculator calculator = new Calculator();
        assertEquals(15.8, calculator.add(5.5, 10.3), 0.001);
    }

    @Test
    void testCalculateArea_Rectangle() {
        Calculator calculator = new Calculator();
        assertEquals(50, calculator.calculateArea(5, 10));
    }

    @Test
    void testCalculateArea_Circle() {
        Calculator calculator = new Calculator();
        assertEquals(153.938, calculator.calculateArea(7.0), 0.001);
    }

}