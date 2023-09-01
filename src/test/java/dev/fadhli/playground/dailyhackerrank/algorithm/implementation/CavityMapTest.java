package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class CavityMapTest {

    @Test
    void sampleTestCase0() {
        List<String> input = Stream.of("1112", "1912", "1892", "1234").collect(toList());
        List<String> output = Stream.of("1112", "1X12", "18X2", "1234").collect(toList());
        assertEquals(output, CavityMap.solution(input));
    }

    @Test
    void sampleTestCase1() {
        List<String> input = Stream.of("12", "12").collect(toList());
        List<String> output = Stream.of("12", "12").collect(toList());
        assertEquals(output, CavityMap.solution(input));
    }

}