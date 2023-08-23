package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HalloweenSaleTest {

    @Test
    void sampleTestCase0() {
        assertEquals(6, HalloweenSale.solution(20, 3, 6, 80));
    }

    @Test
    void sampleTestCase1() {
        assertEquals(7, HalloweenSale.solution(20, 3, 6, 85));
    }

}