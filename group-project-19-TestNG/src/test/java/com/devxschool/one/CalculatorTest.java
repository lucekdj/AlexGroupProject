package com.devxschool.one;

import io.cucumber.java.Before;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    // Initialize the Calculator class before each test case and set it to null after each test case to ensure clean state.
@BeforeMethod
    public void beforeMethod() {
        calculator = new Calculator();
        // TODO complete the method
    }

@AfterMethod
    public void afterMethod() {
    calculator = null;
        // TODO complete the method
    }

    // Positive test cases

    // Test the addition method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
@Test
    public void testAddition() {
        int actualResult = calculator.add(13,76);
        int expectedResult = 89;

        assertEquals(actualResult,expectedResult);
    }

    // Test the subtraction method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
@Test
    public void testSubtraction() {
       assertEquals(calculator.subtract(45,32),13);

    }

    // Test the multiplication method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
@Test
    public void testMultiplication() {
       assertEquals(calculator.multiply(4500,2),9000);
    }

    // Test the division method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
@Test
    public void testDivision() {
        assertEquals(calculator.divide(864,2),432);
    }

    // Test the division method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
@Test
    public void testDivisionWithDouble() {
    assertEquals(calculator.divide(34.6, 2.0), 17.3);
    }

    // Test the mod method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
@Test
    public void testMod() {
        assertEquals(calculator.mod(100,3),1);
    }

    // Negative test cases

    // Test the division method of the Calculator class using a negative test case with an input of zero as the denominator and assert that the correct exception is thrown.
@Test
    public void testDivisionByZero() {
       assertThrows(ArithmeticException.class,()->calculator.divide(100,0));
    }

    // Test the division method of the Calculator class using a negative test case with an input of zero as the denominator and assert that the correct exception is thrown.
@Test
    public void testDivisionByZeroWithDouble() {
        assertThrows(ArithmeticException.class,()->calculator.divide(100.0,0.0));
    }

    // Test the mod method of the Calculator class using a negative test case with an input of zero as the denominator and assert that the correct exception is thrown.
    @Test
    public void testModByZero() {
        assertThrows(ArithmeticException.class,()->calculator.mod(23,0));
    }
}