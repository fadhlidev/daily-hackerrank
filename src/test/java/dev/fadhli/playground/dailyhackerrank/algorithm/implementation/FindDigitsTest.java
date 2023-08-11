package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDigitsTest {

    @Test
    void sampleTestCase0() {
        assertEquals(2, FindDigits.solution(12));
        assertEquals(3, FindDigits.solution(1012));
    }

}