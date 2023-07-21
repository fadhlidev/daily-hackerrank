package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarrayDivisionTest {

    @Test
    void sampleTestCase0() {
        List<Integer> s = Stream.of(1, 2, 1, 3, 2).collect(toList());
        assertEquals(2, SubarrayDivision.solution(s, 3, 2));
    }

    @Test
    void sampleTestCase1() {
        List<Integer> s = Stream.of(1, 1, 1, 1, 1, 1).collect(toList());
        assertEquals(0, SubarrayDivision.solution(s, 3, 2));
    }

    @Test
    void sampleTestCase2() {
        List<Integer> s = Stream.of(4, 1).collect(toList());
        assertEquals(1, SubarrayDivision.solution(s, 4, 1));
    }

}