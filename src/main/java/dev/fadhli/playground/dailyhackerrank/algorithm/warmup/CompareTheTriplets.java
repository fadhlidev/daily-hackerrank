package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    public static List<Integer> solution(List<Integer> a, List<Integer> b) {
        int ra = 0, rb = 0;

        for (int i = 0; i < 3; i++) {
            ra += a.get(i) > b.get(i) ? 1 : 0;
            rb += b.get(i) > a.get(i) ? 1 : 0;
        }

        return Stream.of(ra, rb).collect(toList());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = solution(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
