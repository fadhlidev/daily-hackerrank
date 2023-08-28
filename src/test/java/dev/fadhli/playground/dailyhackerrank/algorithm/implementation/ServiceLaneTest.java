package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLaneTest {

    @Test
    void sampleTestCase0() {
        int n = 8;
        List<Integer> width = listOf(2, 3, 1, 2, 3, 2, 3, 3);
        List<List<Integer>> cases = listOf(listOf(0, 3), listOf(4, 6), listOf(6, 7), listOf(3, 5), listOf(0, 7));
        List<Integer> result = listOf(1, 2, 3, 2, 1);
        assertEquals(result, ServiceLane.solution(n, cases, width));
    }

    @Test
    void sampleTestCase1() {
        int n = 5;
        List<Integer> width = listOf(1, 2, 2, 2, 1);
        List<List<Integer>> cases = listOf(listOf(2, 3), listOf(1, 4), listOf(2, 4), listOf(2, 4), listOf(2, 3));
        List<Integer> result = listOf(2, 1, 1, 1, 2);
        assertEquals(result, ServiceLane.solution(n, cases, width));
    }

    @SafeVarargs
    private final <T> List<T> listOf(T... args) {
        return Stream.of(args).collect(Collectors.toList());
    }

}