package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class AppleAndOrangeTest {

    @Test
    void sampleTestCase0() {
        List<Integer> apples = Stream.of(-2, 2, 1).collect(toList());
        List<Integer> oranges = Stream.of(5, -6).collect(toList());
        AppleAndOrange.solution(7, 11, 5, 15, apples, oranges);
    }

}