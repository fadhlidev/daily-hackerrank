package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class PlusMinusTest {

    @Test
    void sampleTestCase0() {
        PlusMinus.solution(Stream.of(-4, 3, -9, 0, 4, 1).collect(toList()));
    }

}