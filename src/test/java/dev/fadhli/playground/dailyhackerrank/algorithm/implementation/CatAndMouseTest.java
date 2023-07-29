package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatAndMouseTest {

    @Test
    void sampleTestCase0() {
        assertEquals("Cat B", CatAndMouse.solution(1, 2, 3));
        assertEquals("Mouse C", CatAndMouse.solution(1, 3, 2));
    }

}