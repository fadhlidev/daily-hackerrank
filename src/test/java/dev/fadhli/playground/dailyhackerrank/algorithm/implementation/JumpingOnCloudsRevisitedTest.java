package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnCloudsRevisitedTest {

    @Test
    void sampleTestCase0() {
        assertEquals(92, JumpingOnCloudsRevisited.solution(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(80, JumpingOnCloudsRevisited.solution(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
    }

}