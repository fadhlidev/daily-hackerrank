package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TheHurdleRaceTest {

    @Test
    void sampleTestCase0() {
        assertEquals(2, TheHurdleRace.solution(4, Stream.of(1, 6, 3, 5, 2).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(0, TheHurdleRace.solution(7, Stream.of(2, 5, 4, 5, 2).collect(toList())));
    }

}