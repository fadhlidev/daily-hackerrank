package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class EqualizeArray {

    public static int solution(List<Integer> arr) {
        Set<Integer> uniqueNumbers = new HashSet<>(arr);
        List<Integer> actionsPerNumber = new ArrayList<>();

        for (int number : uniqueNumbers) {
            List<Integer> action = new ArrayList<>(arr);
            action.removeIf(n -> n.equals(number));
            actionsPerNumber.add(action.size());
        }

        return actionsPerNumber.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = solution(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
