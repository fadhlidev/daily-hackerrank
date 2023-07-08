package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveMeFirstTest {

    @Test
    void sampleTestCase0() {
        assertEquals(5, SolveMeFirst.solution(2, 3));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(1100, SolveMeFirst.solution(100, 1000));
    }

}