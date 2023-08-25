package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateFeastTest {

    @Test
    void sampleTestCase0() {
        assertEquals(6, ChocolateFeast.solution(10, 2, 5));
        assertEquals(3, ChocolateFeast.solution(12, 4, 4));
        assertEquals(5, ChocolateFeast.solution(6, 2, 2));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(3, ChocolateFeast.solution(7, 3, 2));
    }

}