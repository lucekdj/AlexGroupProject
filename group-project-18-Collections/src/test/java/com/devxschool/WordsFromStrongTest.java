package com.devxschool;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsFromStrongTest {

    @Test
    public void testMultiplyWords() {
        List<String> result = WordsFromString.multiplyWords("This is a test sentence");
        List<String> expectedResult = List.of("This", "is", "is", "a", "a", "a", "test", "test", "test", "test", "sentence", "sentence", "sentence", "sentence", "sentence");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplyWordsEmpty() {
        List<String> result = WordsFromString.multiplyWords("");
        assertEquals(1, result.size());
    }

    @Test
    public void testMultiplyWordsWithSpecialChar() {
        List<String> result = WordsFromString.multiplyWords("This@ is a test sentence");
        List<String> expectedResult = List.of("This@", "is", "is", "a", "a", "a", "test", "test", "test", "test", "sentence", "sentence", "sentence", "sentence", "sentence");
        assertEquals(expectedResult, result);
    }
}
