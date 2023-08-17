package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpingOnCloudsTest {

    @Test
    void sampleTestCase0() {
        assertEquals(4, JumpingOnClouds.solution(Stream.of(0, 0, 1, 0, 0, 1, 0).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(3, JumpingOnClouds.solution(Stream.of(0, 0, 0, 1, 0, 0).collect(toList())));
    }

}