package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class AppleAndOrange {

    public static void solution(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int totalApples = 0, totalOranges = 0;
        for (int i = 0; i < Math.max(apples.size(), oranges.size()); i++) {
            if (i < apples.size()) {
                int pos = a + apples.get(i);
                totalApples += isInRange(s, t, pos) ? 1 : 0;
            }

            if (i < oranges.size()) {
                int pos = b + oranges.get(i);
                totalOranges += isInRange(s, t, pos) ? 1 : 0;
            }
        }

        System.out.println(totalApples);
        System.out.println(totalOranges);
    }

    public static boolean isInRange(int start, int end, int pos) {
        return pos >= start && pos <= end;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        solution(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }

}
