package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    @Test
    void sampleTestCase0() {
        assertEquals(1, CountingValleys.solution(8, "UDDDUDUU"));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(2, CountingValleys.solution(12, "DDUUDDUDUUUD"));
    }

}