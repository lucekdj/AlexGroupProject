package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class DogTest {

    Dog dog = new Dog();

    @Test
    public void moveTest() {

        String expected = "Dogs can run from 15 mph and greyhound can reach is 45 mph";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        dog.move();

        assertEquals("Output of movable dog should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void getMessageTest() {

        assertEquals("Get message method should return  message for Movable and Dog",
                "This animal can move - Hi, I am a Dog and this is an INSTANCE method", dog.getMessage());

    }

    @Test
    public void soundTest() {

        String expected = "Bark";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        dog.sound();

        assertEquals("Output of soundable dog should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

}
