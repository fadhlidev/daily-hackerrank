package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaumAndBirthdayTest {

    @Test
    void sampleTestCase0() {
        assertEquals(20, TaumAndBirthday.solution(10, 10, 1, 1, 1));
        assertEquals(37, TaumAndBirthday.solution(5, 9, 2, 3, 4));
        assertEquals(12, TaumAndBirthday.solution(3, 6, 9, 1, 1));
        assertEquals(35, TaumAndBirthday.solution(7, 7, 4, 2 ,1));
        assertEquals(12, TaumAndBirthday.solution(3, 3, 1, 9, 2));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(29, TaumAndBirthday.solution(3, 5, 3, 4, 1));
    }

}