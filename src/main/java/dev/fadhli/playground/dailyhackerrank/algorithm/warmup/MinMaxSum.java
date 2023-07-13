package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMaxSum {

    public static void solution(List<Integer> arr) {
        List<Integer> sortedArr = arr.stream().sorted().collect(toList());

        long minSum = 0L, maxSum = 0L;
        for (int i = 0; i < 4; i++) {
            minSum += sortedArr.get(i).longValue();
            maxSum += sortedArr.get(sortedArr.size() - 1 - i).longValue();
        }

        System.out.printf("%d %d\n", minSum, maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        solution(arr);

        bufferedReader.close();
    }

}
