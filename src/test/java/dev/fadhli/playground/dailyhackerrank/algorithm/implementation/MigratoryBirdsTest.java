package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MigratoryBirdsTest {

    @Test
    void sampleTestCase0() {
        assertEquals(4, MigratoryBirds.solution(Stream.of(1, 4, 4, 4, 5, 3).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(3, MigratoryBirds.solution(Stream.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4).collect(toList())));
    }

}