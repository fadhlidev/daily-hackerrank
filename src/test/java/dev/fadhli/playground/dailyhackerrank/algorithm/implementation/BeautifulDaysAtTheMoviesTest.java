package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulDaysAtTheMoviesTest {

    @Test
    void sampleTestCase0() {
        assertEquals(2, BeautifulDaysAtTheMovies.solution(20, 23, 6));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(33, BeautifulDaysAtTheMovies.solution(13, 45, 3));
    }

}