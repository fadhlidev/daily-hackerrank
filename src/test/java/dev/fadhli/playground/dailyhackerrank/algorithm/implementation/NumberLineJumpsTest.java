package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberLineJumpsTest {

    @Test
    void sampleTestCase0() {
        assertEquals("YES", NumberLineJumps.solution(0, 3, 4, 2));
    }

    @Test
    void sampleTestCase1() {
        assertEquals("NO", NumberLineJumps.solution(0, 2, 5, 3));
    }

    @Test
    void sampleTestCase2() {
        assertEquals("YES", NumberLineJumps.solution(14, 4, 98, 2));
    }

    @Test
    void sampleTestCase3() {
        assertEquals("NO", NumberLineJumps.solution(43, 2, 70, 2));
    }

}