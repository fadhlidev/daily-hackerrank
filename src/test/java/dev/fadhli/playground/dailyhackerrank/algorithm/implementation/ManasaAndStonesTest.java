package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ManasaAndStonesTest {

    @Test
    void sampleTestCase0() {
        assertEquals(Stream.of(2, 3, 4).collect(toList()), ManasaAndStones.solution(3, 1, 2));
        assertEquals(Stream.of(30, 120, 210, 300).collect(toList()), ManasaAndStones.solution(4, 10, 100));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(Stream.of(54, 56, 58, 60, 62, 64, 66).collect(toList()), ManasaAndStones.solution(7, 9, 11));
        assertEquals(Stream.of(24, 32, 40, 48).collect(toList()), ManasaAndStones.solution(4, 8, 16));
    }

}