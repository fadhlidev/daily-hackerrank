package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfTheProgrammerTest {

    @Test
    void sampleTestCase0() {
        assertEquals("13.09.2017", DayOfTheProgrammer.solution(2017));
    }

    @Test
    void sampleTestCase1() {
        assertEquals("12.09.2016", DayOfTheProgrammer.solution(2016));
    }

    @Test
    void sampleTestCase2() {
        assertEquals("12.09.1800", DayOfTheProgrammer.solution(1800));
    }

}