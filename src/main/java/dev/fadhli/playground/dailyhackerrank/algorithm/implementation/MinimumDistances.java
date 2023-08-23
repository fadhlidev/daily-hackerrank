package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinimumDistances {

    public static int solution(List<Integer> a) {
        Map<Integer, Integer> numberIndices = new HashMap<>();
        List<Integer> distances = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            int number = a.get(i);
            if (numberIndices.containsKey(number)) {
                int lastIndex = numberIndices.get(number);
                int distance = i - lastIndex;
                distances.add(distance);
            }
            numberIndices.put(number, i);
        }

        if (distances.isEmpty()) {
            return -1;
        } else {
            return distances.stream().min(Integer::compareTo).get();
        }
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
