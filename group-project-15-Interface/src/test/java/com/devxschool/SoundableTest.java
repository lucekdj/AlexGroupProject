package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class SoundableTest {

    @Test
    public void soundTest1() {
        String expected = "Meow";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Soundable soundable = new Cat();
        soundable.sound();

        assertEquals("Output of soundable cat should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void soundTest2() {
        String expected = "Bark";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Soundable soundable = new Dog();
        soundable.sound();

        assertEquals("Output of soundable dog should be equal", expected, out.toString().replace("\n", "").replace("\r", ""));
    }
}
