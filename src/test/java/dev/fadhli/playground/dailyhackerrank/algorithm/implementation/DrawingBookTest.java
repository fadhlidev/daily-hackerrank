package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {

    @Test
    void sampleTestCase0() {
        assertEquals(1, DrawingBook.solution(6, 2));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(0, DrawingBook.solution(5, 4));
    }

}