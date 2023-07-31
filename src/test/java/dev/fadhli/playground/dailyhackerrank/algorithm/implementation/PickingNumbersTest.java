package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PickingNumbersTest {

    @Test
    void sampleTestCase0() {
        assertEquals(3, PickingNumbers.solution(Stream.of(4, 6, 5, 3, 3, 1).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(5, PickingNumbers.solution(Stream.of(1, 2, 2, 3, 1, 2).collect(toList())));
    }

}