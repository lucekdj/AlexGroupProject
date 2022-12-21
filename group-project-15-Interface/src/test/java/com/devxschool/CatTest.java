package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class CatTest{

    Cat cat = new Cat();

    @Test
    public void moveTest() {

        String expected = "Cat can run about 30 mph";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        cat.move();

        assertEquals("Output of cat should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void getMessageTest() {

        assertEquals("Get message method should return message for Cat",
                "This message is from Cat - Hi, I am a Cat and this is an INSTANCE method", cat.getMessage());
    }

    @Test
    public void soundTest() {
        String expected = "Meow";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        cat.sound();

        assertEquals("Output of cat sound should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void printMessageTest(){
        String expected = "This message is from Cat - Hi, I am a Cat and this is a STATIC method";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Cat.printMessage();
        assertEquals("Output of cat print message method should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }
}
