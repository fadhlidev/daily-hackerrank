package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {

    public static void solution(List<Integer> arr) {
        int positives = 0, negatives = 0, zeros = 0;

        for (int a : arr) {
            if (a < 0) {
                negatives++;
                continue;
            }

            if (a > 0) {
                positives++;
                continue;
            }

            zeros++;
        }

        System.out.println((double) positives / arr.size());
        System.out.println((double) negatives / arr.size());
        System.out.println((double) zeros / arr.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        solution(arr);

        bufferedReader.close();
    }

}
