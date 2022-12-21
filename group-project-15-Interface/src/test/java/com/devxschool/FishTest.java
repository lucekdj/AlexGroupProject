package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class FishTest {

    Fish fish = new Fish();

    @Test
    public void move() {

        String expected = "Fish swims in the water from 2 mph and white shark can reach 35 mph";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        fish.move();

        assertEquals("Output of fish should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

}
