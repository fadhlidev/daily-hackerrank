package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesByMatchTest {

    @Test
    void sampleTestCase0() {
        List<Integer> socks = Stream.of(10, 20, 20, 10, 10, 30, 50, 10, 20).collect(toList());
        assertEquals(3, SalesByMatch.solution(socks.size(), socks));
    }

    @Test
    void sampleTestCase1() {
        List<Integer> socks = Stream.of(1, 1, 3, 1, 2, 1, 3, 3, 3, 3).collect(toList());
        assertEquals(4, SalesByMatch.solution(socks.size(), socks));
    }

}