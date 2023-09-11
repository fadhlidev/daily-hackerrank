package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrangeCounterTest {

    @Test
    void sampleTestCase0() {
        assertEquals(6, StrangeCounter.solution(4));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(5, StrangeCounter.solution(17));
    }

}