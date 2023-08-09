package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SequenceEquation {

    public static List<Integer> solution(List<Integer> p) {
        List<Integer> history = new ArrayList<>();
        int indexOfX, indexOfY;

        for (int x = 1; x <= p.size(); x++) {
            indexOfX = p.indexOf(x) + 1;
            indexOfY = p.indexOf(indexOfX) + 1;
            history.add(indexOfY);
        }

        return history;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = solution(p);

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
