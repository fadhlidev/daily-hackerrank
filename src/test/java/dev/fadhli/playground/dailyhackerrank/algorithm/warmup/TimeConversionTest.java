package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {

    @Test
    void sampleTestCase0() {
        assertEquals("19:05:45", TimeConversion.solution("07:05:45PM"));
    }

    @Test
    void sampleTestCase1() {
        assertEquals("00:40:22", TimeConversion.solution("12:40:22AM"));
    }

    @Test
    void sampleTestCase3() {
        assertEquals("12:45:54", TimeConversion.solution("12:45:54PM"));
    }

    @Test
    void sampleTestCase2() {
        assertEquals("07:30:32", TimeConversion.solution("07:30:32AM"));
    }

}