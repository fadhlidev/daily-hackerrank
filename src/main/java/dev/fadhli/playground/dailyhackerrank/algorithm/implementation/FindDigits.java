package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FindDigits {

    public static int solution(int n) {
        int[] digits = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        int divisorCount = 0;

        for (int digit : digits) {
            if (digit != 0 && n % digit == 0) {
                divisorCount++;
            }
        }

        return divisorCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = solution(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }

}
