package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class MinMaxSumTest {

    @Test
    void sampleTestCase0() {
        MinMaxSum.solution(Stream.of(1, 2, 3, 4, 5).collect(toList()));
    }

    @Test
    void sampleTestCase1() {
        MinMaxSum.solution(Stream.of(7, 69, 2, 221, 8974).collect(toList()));
    }

}