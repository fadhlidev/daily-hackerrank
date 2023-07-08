package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void sampleTestCase0() {
        assertEquals(31, SimpleArraySum.solution(Stream.of(1, 2, 3, 4, 10, 11).collect(toList())));
    }

}