package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GradingStudentsTest {

    @Test
    void sampleTestCase0() {
        List<Integer> input = Stream.of(73, 67, 38, 33).collect(toList());
        List<Integer> output = Stream.of(75, 67, 40, 33).collect(toList());
        assertEquals(output, GradingStudents.solution(input));
    }

}