package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ACMICPCTeamTest {

    @Test
    void sampleTest0() {
        List<String> input = Stream.of("10101", "11100", "11010", "00101").collect(toList());
        List<Integer> output = Stream.of(5, 2).collect(toList());
        assertEquals(output, ACMICPCTeam.solution(input));
    }

    @Test
    void sampleTest1() {
        List<String> input = Stream.of("11101", "10101", "11001", "10111", "10000", "01110").collect(toList());
        List<Integer> output = Stream.of(5, 6).collect(toList());
        assertEquals(output, ACMICPCTeam.solution(input));
    }

}