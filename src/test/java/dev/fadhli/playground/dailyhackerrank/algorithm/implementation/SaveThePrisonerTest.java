package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SaveThePrisonerTest {

    @Test
    void sampleTestCase0() {
        assertEquals(2, SaveThePrisoner.solution(5, 2, 1));
        assertEquals(3, SaveThePrisoner.solution(5, 2, 2));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(6, SaveThePrisoner.solution(7, 19, 2));
        assertEquals(3, SaveThePrisoner.solution(3, 7, 3));
    }

}