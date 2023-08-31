package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FairRationsTest {

    @Test
    void sampleTestCase0() {
        assertEquals("4", FairRations.solution(Stream.of(2, 3, 4, 5, 6).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals("NO", FairRations.solution(Stream.of(1, 2).collect(toList())));
    }

}