package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTest {
    Discount1 discountObj = new Discount1();

    @Test
    public void calculateDiscountTest(){
        double result = discountObj.calculateDiscount(10, 10);
        assertEquals("Customer total after 10% discount for $10.00 should be $9.00", 9d, result, 0.001);
    }

    @Test
    public void calculateDiscountTest2(){
        double result = discountObj.calculateDiscount(100, 50);
        assertEquals("Customer total after 50% discount for $100.00 should be $50.00", 50d, result, 0.001);
    }
}
