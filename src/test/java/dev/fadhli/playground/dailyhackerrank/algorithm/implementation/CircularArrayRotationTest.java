package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CircularArrayRotationTest {

    @Test
    void sampleTestCase0() {
        List<Integer> result = Stream.of(2, 3, 1).collect(toList());
        List<Integer> a = Stream.of(1, 2, 3).collect(toList());
        List<Integer> queries = Stream.of(0, 1, 2).collect(toList());
        assertEquals(result, CircularArrayRotation.solution(a, 2, queries));
    }

}