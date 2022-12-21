package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class DemoTest {
    @Test
    public void mainTest() {

        String expected =
                "This message is from Cat - Hi, I am a Cat and this is an INSTANCE method" +
                        "This message is from Cat - Hi, I am a Cat and this is an INSTANCE method" +
                        "This animal can move - Hi, I am a Dog and this is an INSTANCE method" +
                        "This animal can move - Hi, I am a Dog and this is an INSTANCE method" +
                        "This animal can move" +
                        "This animal can move" +
                        "This animal can move - Hi, I am a movable and this is a STATIC method" +
                        "This message is from Cat - Hi, I am a Cat and this is a STATIC method" +
                        "Cat can run about 30 mph" +
                        "Dogs can run from 15 mph and greyhound can reach is 45 mph" +
                        "Fish swims in the water from 2 mph and white shark can reach 35 mph" +
                        "Cat can run about 30 mph" +
                        "Dogs can run from 15 mph and greyhound can reach is 45 mph" +
                        "Fish swims in the water from 2 mph and white shark can reach 35 mph" +
                        "Meow" +
                        "Bark" +
                        "Meow" +
                        "Bark";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Demo.main(new String[0]);

        assertEquals("Output of main method should be equal", expected, out.toString().replace("\n", "").replaceAll("\r", ""));
    }
}
