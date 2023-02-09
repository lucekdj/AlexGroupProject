package com.devxschool;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ConcordanceOfCharsTest {
    Map<Character, Set<Integer>> concordance = ConcordanceOfChars.showConcordance("This is a test sentence!");

    @Test
    public void testShowConcordance1() {
        Set<Integer> expectedIndicesT = new HashSet<>();
        expectedIndicesT.add(0);
        assertEquals(expectedIndicesT, concordance.get('T'));
    }

    @Test
    public void testShowConcordance2() {
        Set<Integer> expectedIndicesS = new HashSet<>();
        expectedIndicesS.add(3);
        expectedIndicesS.add(6);
        expectedIndicesS.add(12);
        expectedIndicesS.add(15);
        assertEquals(expectedIndicesS, concordance.get('s'));
    }

    @Test
    public void testShowConcordance3() {
        Set<Integer> expectedIndicesE = new HashSet<>();
        expectedIndicesE.add(16);
        expectedIndicesE.add(19);
        expectedIndicesE.add(22);
        expectedIndicesE.add(11);
        assertEquals(expectedIndicesE, concordance.get('e'));
    }

    @Test
    public void testShowConcordance4() {
        assertNull(concordance.get(' '));
    }
}
