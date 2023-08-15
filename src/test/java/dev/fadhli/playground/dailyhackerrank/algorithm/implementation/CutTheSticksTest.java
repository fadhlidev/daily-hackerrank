package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class CutTheSticksTest {

    @Test
    void sampleTestCase0() {
        List<Integer> input = Stream.of(5, 4, 4, 2, 2, 8).collect(toList());
        List<Integer> output = Stream.of(6, 4, 2 ,1).collect(toList());
        assertEquals(output, CutTheSticks.solution(input));
    }

    @Test
    void sampleTestCase1() {
        List<Integer> input = Stream.of(1, 2, 3, 4, 3, 3, 2, 1).collect(toList());
        List<Integer> output = Stream.of(8, 6, 4 ,1).collect(toList());
        assertEquals(output, CutTheSticks.solution(input));
    }

}