package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {

    public static int solution(List<Integer> arr) {
        Map<Integer, Integer> birdSight = new HashMap<>();

        for (int birdId : arr) {
            birdSight.put(birdId, birdSight.get(birdId) != null ? birdSight.get(birdId) + 1 : 1);
        }

        int mostId = 0, mostSight = 0;
        for (int birdId : birdSight.keySet()) {
            int temp = mostSight;

            if (mostSight < birdSight.get(birdId)) {
                mostSight = birdSight.get(birdId);
            }

            if (temp != mostSight) {
                mostId = birdId;
            }
        }

        return mostId;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

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
