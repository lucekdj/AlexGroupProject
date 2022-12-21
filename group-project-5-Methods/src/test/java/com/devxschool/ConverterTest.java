package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ConverterTest {
    Converter converter = new Converter();
    @Test
    public void isWeightTest() {

        assertTrue(converter.isWeight("lb"));
        assertTrue(converter.isWeight("oz"));
        assertFalse(converter.isWeight("ft"));
        assertFalse(converter.isWeight("in"));
        assertFalse(converter.isWeight("F"));
        assertFalse(converter.isWeight("aa"));
    }
    @Test
    public void calculateWeightTest() {
        double weight = converter.calculateWeight("lb", "kg", 1);
        assertEquals(0.45359237d, weight, 0.001);
        weight = converter.calculateWeight("lb", "kg", 10);
        assertEquals(4.5359237d, weight,0.001);

        weight = converter.calculateWeight("oz", "g", 1);
        assertEquals(28.34952d, weight, 0.001);
        weight = converter.calculateWeight("oz", "g", 10);
        assertEquals(283.4952d, weight, 0.001);
    }
    @Test
    public void isLengthTest() {
        assertTrue(converter.isLength("ft"));
        assertTrue(converter.isLength("in"));
        assertFalse(converter.isLength("lb"));
        assertFalse(converter.isLength("F"));
        assertFalse(converter.isLength("aa"));
    }
    @Test
    public void calculateLengthTest() {
        double length = converter.calculateLength("ft", "m", 1);
        assertEquals(0.3048d, length, 0.001);
        length = converter.calculateLength("ft", "cm", 1);
        assertEquals(30.48d, length,0.001);

        length = converter.calculateLength("in", "cm", 1);
        assertEquals(2.54d, length, 0.001);
        length = converter.calculateLength("in", "cm", 10);
        assertEquals(25.4d, length, 0.001);
    }
    @Test
    public void isTemperatureTest() {
        assertTrue(converter.isTemperature("F"));
        assertFalse(converter.isTemperature("ft"));
        assertFalse(converter.isTemperature("lb"));
        assertFalse(converter.isTemperature("in"));
        assertFalse(converter.isTemperature("oz"));
        assertFalse(converter.isTemperature("aa"));
    }
    @Test
    public void calculateTemperatureTest() {
        double temp = converter.calculateTemperature("F", "C", 5);
        assertEquals(-15, temp, 0.1);
        temp = converter.calculateTemperature("F", "C", 59);
        assertEquals(15, temp, 0.1);
    }
}
