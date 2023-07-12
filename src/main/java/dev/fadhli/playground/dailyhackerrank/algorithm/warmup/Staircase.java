package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Collections.nCopies;

public class Staircase {

    public static void solution(int n) {
        for (int hashtags = 1, spaces = n - hashtags; hashtags <= n; hashtags++, spaces--) {
            System.out.println(repeat(" ", spaces) + repeat("#", hashtags));
        }
    }

    public static String repeat(String str, int repetitions) {
        return String.join("", nCopies(repetitions, str));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        solution(n);

        bufferedReader.close();
    }

}
