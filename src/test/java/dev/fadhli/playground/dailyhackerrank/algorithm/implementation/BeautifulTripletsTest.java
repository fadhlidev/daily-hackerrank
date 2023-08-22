package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BeautifulTripletsTest {

    @Test
    void sampleTestCase0() {
        assertEquals(3, BeautifulTriplets.solution(3, Stream.of(1, 2, 4, 5, 7, 8, 10).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(2, BeautifulTriplets.solution(3, Stream.of(1, 6, 7, 7, 8, 10, 12, 13, 14, 19).collect(toList())));
    }

}