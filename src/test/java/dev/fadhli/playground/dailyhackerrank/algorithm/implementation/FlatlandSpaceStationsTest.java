package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatlandSpaceStationsTest {

    @Test
    void sampleTestCase0() {
        assertEquals(2, FlatlandSpaceStations.solution(5, new int[]{0, 4}));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(0, FlatlandSpaceStations.solution(6, new int[]{0, 1, 2, 4, 3, 5}));
    }

}