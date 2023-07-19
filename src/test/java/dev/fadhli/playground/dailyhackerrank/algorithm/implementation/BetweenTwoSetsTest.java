package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BetweenTwoSetsTest {

    @Test
    void sampleTestCase0() {
        List<Integer> a = Stream.of(2, 4).collect(toList());
        List<Integer> b = Stream.of(16, 32, 96).collect(toList());
        assertEquals(3, BetweenTwoSets.solution(a, b));
    }

    @Test
    void sampleTestCase1() {
        List<Integer> a = Stream.of(3, 9, 6).collect(toList());
        List<Integer> b = Stream.of(36, 72).collect(toList());
        assertEquals(2, BetweenTwoSets.solution(a, b));
    }

    @Test
    void sampleTestCase2() {
        List<Integer> a = Stream.of(1).collect(toList());
        List<Integer> b = Stream.of(100).collect(toList());
        assertEquals(9, BetweenTwoSets.solution(a, b));
    }

    @Test
    void sampleTestCase3() {
        List<Integer> a = Stream.of(2, 3, 6).collect(toList());
        List<Integer> b = Stream.of(42, 84).collect(toList());
        assertEquals(2, BetweenTwoSets.solution(a, b));
    }

    @Test
    void sampleTestCase4() {
        List<Integer> a = Stream.of(3, 4).collect(toList());
        List<Integer> b = Stream.of(24, 48).collect(toList());
        assertEquals(2, BetweenTwoSets.solution(a, b));
    }

}