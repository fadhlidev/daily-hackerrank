package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LisaWorkbookTest {

    @Test
    void sampleTestCase0() {
        assertEquals(4, LisaWorkbook.solution(5, 3, Stream.of(4, 2, 6, 1, 10).collect(toList())));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(8, LisaWorkbook.solution(10, 5, Stream.of(3, 8, 15, 11, 14, 1, 9, 2, 24, 31).collect(toList())));
    }

}