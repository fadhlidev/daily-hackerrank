package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendAndDeleteTest {

    @Test
    void sampleTestCase0() {
        assertEquals("Yes", AppendAndDelete.solution("hackerhappy", "hackerrank", 9));
    }

    @Test
    void sampleTestCase1() {
        assertEquals("Yes", AppendAndDelete.solution("aba", "aba", 7));
    }

    @Test
    void sampleTestCase2() {
        assertEquals("No", AppendAndDelete.solution("ashley", "ash", 2));
    }

    @Test
    void sampleTestCase3() {
        assertEquals("Yes", AppendAndDelete.solution("zzzzz", "zzzzzzz", 4));
    }

}