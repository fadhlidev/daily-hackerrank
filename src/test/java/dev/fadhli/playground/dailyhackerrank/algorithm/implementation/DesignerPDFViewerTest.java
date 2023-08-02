package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DesignerPDFViewerTest {

    @Test
    void sampleTestCase0() {
        List<Integer> heights = Stream.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5).collect(toList());
        assertEquals(9, DesignerPDFViewer.solution(heights, "abc"));
    }

    @Test
    void sampleTestCase1() {
        List<Integer> heights = Stream.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7).collect(toList());
        assertEquals(28, DesignerPDFViewer.solution(heights, "zaba"));
    }

}