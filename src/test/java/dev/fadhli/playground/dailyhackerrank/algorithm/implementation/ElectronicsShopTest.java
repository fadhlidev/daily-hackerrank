package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicsShopTest {

    @Test
    void sampleTestCase0() {
        int[] keyboards = new int[]{3, 1};
        int[] drives = new int[]{5, 2, 8};

        assertEquals(9, ElectronicsShop.solution(keyboards, drives, 10));
    }

    @Test
    void sampleTestCase1() {
        int[] keyboards = new int[]{4};
        int[] drives = new int[]{5};

        assertEquals(-1, ElectronicsShop.solution(keyboards, drives, 5));
    }

}