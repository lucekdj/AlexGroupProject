package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class MovableTest {

    @Test
    public void moveTest() {

        String expected = "Cat can run about 30 mph";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Movable movable = new Cat();
        movable.move();

        assertEquals("Output of movable cat should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void moveTest2() {

        String expected = "Dogs can run from 15 mph and greyhound can reach is 45 mph";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Movable movable = new Dog();
        movable.move();

        assertEquals("Output of movable dog should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void moveTest3() {

        String expected = "Fish swims in the water from 2 mph and white shark can reach 35 mph";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Movable movable = new Fish();
        movable.move();

        assertEquals("Output of movable fish should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void getMessageTest() {

        Movable movable = new Cat();

        assertEquals("Get message method should return  message for Cat",
                "This message is from Cat - Hi, I am a Cat and this is an INSTANCE method", movable.getMessage());
    }

    @Test
    public void getMessageTest2() {

        Movable movable = new Dog();

        assertEquals("Get message method should return  message for Movable and Dog",
                "This animal can move - Hi, I am a Dog and this is an INSTANCE method", movable.getMessage());

    }

    @Test
    public void getMessageTest3() {

        Movable movable = new Fish();

        assertEquals("Get message method should return  message for Movable",
                "This animal can move", movable.getMessage());

    }

    @Test
    public void printMessageTest() {
        String expected = "This animal can move - Hi, I am a movable and this is a STATIC method";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Movable.printMessage();
        assertEquals("Output of movable print message method should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

}
