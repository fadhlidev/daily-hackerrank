package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtopianTreeTest {

    @Test
    void sampleTestCase0() {
        assertEquals(1, UtopianTree.solution(0));
        assertEquals(2, UtopianTree.solution(1));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(7, UtopianTree.solution(4));
        assertEquals(6, UtopianTree.solution(3));
    }

}