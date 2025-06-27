package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    // Setup method (runs before each test)
    @Before
    public void setUp() {
        calc = new Calculator(); // Arrange
        System.out.println("Setup: Calculator initialized.");
    }

    // Teardown method (runs after each test)
    @After
    public void tearDown() {
        calc.clear(); // Clean up if needed
        System.out.println("Teardown: Calculator cleared.");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calc.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testAddNegative() {
        // Act
        int result = calc.add(-1, -2);

        // Assert
        assertEquals(-3, result);
    }
}
