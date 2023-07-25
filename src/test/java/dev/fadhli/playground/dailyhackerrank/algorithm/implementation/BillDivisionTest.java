package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class BillDivisionTest {

    @Test
    void sampleTestCase0() {
        BillDivision.solution(Stream.of(3, 10, 2, 9).collect(toList()), 1, 12);
    }

    @Test
    void sampleTestCase1() {
        BillDivision.solution(Stream.of(3, 10, 2, 9).collect(toList()), 1, 7);
    }

}