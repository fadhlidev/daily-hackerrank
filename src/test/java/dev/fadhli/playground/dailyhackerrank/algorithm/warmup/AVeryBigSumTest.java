package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;


import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AVeryBigSumTest {

    @Test
    void sampleTestCase0() {
        assertEquals(5000000015L, AVeryBigSum.solution(Stream.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L).collect(toList())));
    }

}