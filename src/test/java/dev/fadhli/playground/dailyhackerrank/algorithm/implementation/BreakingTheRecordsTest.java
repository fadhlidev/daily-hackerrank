package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BreakingTheRecordsTest {

    @Test
    void sampleTestCase0() {
        List<Integer> input = Stream.of(10, 5, 20, 20, 4, 5, 2, 25, 1).collect(toList());
        List<Integer> output = Stream.of(2, 4).collect(toList());
        assertEquals(output, BreakingTheRecords.solution(input));
    }

    @Test
    void sampleTestCase1() {
        List<Integer> input = Stream.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42).collect(toList());
        List<Integer> output = Stream.of(4, 0).collect(toList());
        assertEquals(output, BreakingTheRecords.solution(input));
    }

}