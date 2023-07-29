package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SalesByMatch {

    public static int solution(int n, List<Integer> ar) {
        Map<Integer, Integer> sockCollection = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sockId = ar.get(i);
            sockCollection.put(sockId, sockCollection.get(sockId) != null ? sockCollection.get(sockId) + 1 : 1);
        }

        int totalPairs = 0;
        for (int sockId : sockCollection.keySet()) {
            totalPairs += (int) Math.floor((double) sockCollection.get(sockId) / 2);
        }

        return totalPairs;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = solution(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
