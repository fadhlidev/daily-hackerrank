package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AngryProfessorTest {

    @Test
    void sampleTestCase0() {
        assertEquals("YES", AngryProfessor.solution(3, Stream.of(-1, -3, 4, 2).collect(toList())));
        assertEquals("NO", AngryProfessor.solution(2, Stream.of(0, -1, 2, 1).collect(toList())));
    }

}