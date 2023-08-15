package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class RepeatedString {

    public static long solution(String s, long n) {
        int totalPerLetter = s.chars()
                .mapToObj(c -> (char) c)
                .mapToInt(c -> c == 'a' ? 1 : 0)
                .sum();

        long absoluteRepeat = n / s.length();
        long remainingChars = n % s.length();

        long total = absoluteRepeat * totalPerLetter;
        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a') {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = solution(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
