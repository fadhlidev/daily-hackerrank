package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BeautifulTriplets {

    public static int solution(int d, List<Integer> arr) {
        int total = 0;

        for (int i = 0; i < arr.size() - 2; i++) {
            int first = arr.get(i);
            for (int j = i + 1; j < arr.size() - 1; j++) {
                int second = arr.get(j);
                if (second - first != d) continue;
                for (int k = j + 1; k < arr.size(); k++) {
                    int third = arr.get(k);
                    if (third - second != d) continue;
                    total++;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = solution(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
