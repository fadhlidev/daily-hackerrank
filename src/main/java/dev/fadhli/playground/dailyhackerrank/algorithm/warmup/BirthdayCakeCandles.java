package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public class BirthdayCakeCandles {

    public static int solution(List<Integer> candles) {
        List<Integer> sortedCandles = candles.stream().sorted(reverseOrder()).collect(toList());

        int tallestCandle = sortedCandles.get(0), totalTallestCandles = 1;
        for (int i = 1; i < sortedCandles.size(); i++) {
            int currentCandle = sortedCandles.get(i);
            if (currentCandle < tallestCandle) break;
            totalTallestCandles++;
        }

        return totalTallestCandles;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = solution(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
