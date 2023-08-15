package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CutTheSticks {

    public static List<Integer> solution(List<Integer> arr) {
        List<Integer> answer = new ArrayList<>();

        while (!arr.isEmpty()) {
            int shortest = Integer.MAX_VALUE;
            for (int stick : arr) {
                shortest = Math.min(shortest, stick);
            }

            int cuts = 0;
            for (int j = 0; j < arr.size(); j++) {
                arr.set(j, arr.get(j) - shortest);
                cuts++;
            }

            arr.removeIf(stick -> stick == 0);

            answer.add(cuts);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = solution(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
