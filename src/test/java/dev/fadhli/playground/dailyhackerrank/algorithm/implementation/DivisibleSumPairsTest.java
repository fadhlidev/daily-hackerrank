package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisibleSumPairsTest {

    @Test
    void sampleTestCase0() {
        assertEquals(5, DivisibleSumPairs.solution(6, 3, Stream.of(1, 3, 2, 6, 1, 2).collect(toList())));
    }

}