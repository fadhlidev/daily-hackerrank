package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BirthdayCakeCandlesTest {

    @Test
    void sampleTestCase0() {
        int result = BirthdayCakeCandles.solution(Stream.of(3, 2, 1, 3).collect(toList()));
        assertEquals(2, result);
    }

    @Test
    void sampleTestCase1() {
        int result = BirthdayCakeCandles.solution(Stream.of(18, 90, 90, 13, 90, 75, 90, 8, 90, 43).collect(toList()));
        assertEquals(5, result);
    }

}