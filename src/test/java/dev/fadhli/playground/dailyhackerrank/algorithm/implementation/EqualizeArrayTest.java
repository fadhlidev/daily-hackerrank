package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EqualizeArrayTest {

    @Test
    void sampleTestCase0() {
        assertEquals(2, EqualizeArray.solution(Stream.of(3, 3, 2, 1, 3).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(4, EqualizeArray.solution(Stream.of(1, 2, 3, 1, 2, 3, 3, 3).collect(toList())));
    }

}