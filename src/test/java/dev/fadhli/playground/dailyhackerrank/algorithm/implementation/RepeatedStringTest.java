package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringTest {

    @Test
    void sampleTestCase0() {
        assertEquals(7, RepeatedString.solution("aba", 10L));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(1000000000000L, RepeatedString.solution("a", 1000000000000L));
    }

}