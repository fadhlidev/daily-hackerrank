package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PickingNumbers {

    public static int solution(List<Integer> a) {
        int longestSubarrayLength = 0;

        for (int i = 0; i < a.size(); i++) {
            int longerSubarrayLength = getLongerSubarrayLength(a, i);

            if (longerSubarrayLength > longestSubarrayLength) {
                longestSubarrayLength = longerSubarrayLength;
            }
        }

        return longestSubarrayLength;
    }

    private static int getLongerSubarrayLength(List<Integer> a, int i) {
        int currentNumber = a.get(i);
        int nextNumber;

        List<Integer> greaterSubarray = new ArrayList<>();
        greaterSubarray.add(currentNumber);

        List<Integer> lesserSubarray = new ArrayList<>();
        lesserSubarray.add(currentNumber);

        for (int j = i + 1; j < a.size(); j++) {
            nextNumber = a.get(j);

            if (currentNumber == nextNumber) {
                greaterSubarray.add(nextNumber);
                lesserSubarray.add(nextNumber);
                continue;
            }

            if (currentNumber > nextNumber && currentNumber - nextNumber <= 1) {
                lesserSubarray.add(nextNumber);
                continue;
            }

            if (currentNumber < nextNumber && nextNumber - currentNumber <= 1) {
                greaterSubarray.add(nextNumber);
            }
        }

        return Math.max(greaterSubarray.size(), lesserSubarray.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = solution(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
