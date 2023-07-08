package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class CompareTheTripletsTest {

    @Test
    void sampleTestCase0() {
        List<Integer> a = Stream.of(5, 6, 7).collect(toList());
        List<Integer> b = Stream.of(3, 6, 10).collect(toList());
        List<Integer> result = Stream.of(1, 1).collect(toList());

        assertEquals(result, CompareTheTriplets.solution(a, b));
    }

    @Test
    void sampleTestCase1() {
        List<Integer> a = Stream.of(17, 28, 30).collect(toList());
        List<Integer> b = Stream.of(99, 16, 8).collect(toList());
        List<Integer> result = Stream.of(2, 1).collect(toList());

        assertEquals(result, CompareTheTriplets.solution(a, b));
    }

}