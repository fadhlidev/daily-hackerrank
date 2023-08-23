package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDistancesTest {

    @Test
    void sampleTestCase0() {
        assertEquals(3, MinimumDistances.solution(Stream.of(7, 1, 3, 4, 1, 7).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(-1, MinimumDistances.solution(Stream.of(1, 2, 3, 4, 10).collect(toList())));
    }

}