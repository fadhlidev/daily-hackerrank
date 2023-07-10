package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiagonalDifferenceTest {

    @Test
    void sampleTestCase0() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Stream.of(11, 2, 4).collect(toList()));
        matrix.add(Stream.of(4, 5, 6).collect(toList()));
        matrix.add(Stream.of(10, 8, -12).collect(toList()));

        assertEquals(15, DiagonalDifference.solution(matrix));
    }

}