package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyLadybugsTest {

    @Test
    void sampleTestCase0() {
        assertEquals("YES", HappyLadybugs.solution("RBY_YBR"));
        assertEquals("NO", HappyLadybugs.solution("X_Y__X"));
        assertEquals("YES", HappyLadybugs.solution("__"));
        assertEquals("YES", HappyLadybugs.solution("B_RRBR"));
    }

    @Test
    void sampleTestCase1() {
        assertEquals("NO", HappyLadybugs.solution("AABBC"));
        assertEquals("YES", HappyLadybugs.solution("AABBC_C"));
        assertEquals("YES", HappyLadybugs.solution("_"));
        assertEquals("YES", HappyLadybugs.solution("DD__FQ_QQF"));
        assertEquals("NO", HappyLadybugs.solution("AABCBC"));
    }
}