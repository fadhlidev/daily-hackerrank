package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FairRations {

    public static String solution(List<Integer> B) {
        int sum = B.stream().mapToInt(Integer::intValue).sum();

        if (sum % 2 != 0) {
            return "NO";
        }

        int loaves = 0;
        for (int i = 0; i < B.size() - 1; i++) {
            if (B.get(i) % 2 != 0) {
                B.set(i, B.get(i) + 1);
                B.set(i + 1, B.get(i + 1) + 1);
                loaves += 2;
            }
        }

        return String.valueOf(loaves);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String result = solution(B);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
