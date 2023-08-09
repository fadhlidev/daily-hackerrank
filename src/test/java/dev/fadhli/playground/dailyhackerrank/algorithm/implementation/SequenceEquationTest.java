package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceEquationTest {

    @Test
    void sampleTestCase0() {
        List<Integer> input = Stream.of(2, 3, 1).collect(toList());
        List<Integer> output = Stream.of(2, 3, 1).collect(toList());
        assertEquals(output, SequenceEquation.solution(input));
    }

    @Test
    void sampleTestCase1() {
        List<Integer> input = Stream.of(4, 3, 5, 1, 2).collect(toList());
        List<Integer> output = Stream.of(1, 3, 5, 4, 2).collect(toList());
        assertEquals(output, SequenceEquation.solution(input));
    }

}