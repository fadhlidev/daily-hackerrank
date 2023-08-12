package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndSquaresTest {

    @Test
    void sampleTestCase0() {
        assertEquals(2, SherlockAndSquares.solution(3, 9));
        assertEquals(0, SherlockAndSquares.solution(17, 24));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(3, SherlockAndSquares.solution(35, 70));
        assertEquals(22, SherlockAndSquares.solution(100, 1000));
    }

}