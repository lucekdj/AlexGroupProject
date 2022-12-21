package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeapYearTest {
    LeapYear leapYear = new LeapYear();

    @Test
    public void leapOrNotTest() {
        assertEquals("2000 is a leap year", true, leapYear.leapOrNot(2000));
        assertEquals("2020 is a leap year", true, leapYear.leapOrNot(2020));
        assertEquals("2001 is not a leap year", false, leapYear.leapOrNot(2001));
        assertEquals("1 is not a leap year", false, leapYear.leapOrNot(1));
    }
}
