package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class BeautifulDaysAtTheMovies {

    public static int solution(int i, int j, int k) {
        int totalBeautifulDays = 0;

        for (int day = i; day <= j; day++) {
            int reversedDay = reverseInt(day);
            int difference = Math.abs(day - reversedDay);
            if (difference % k == 0) totalBeautifulDays++;
        }

        return totalBeautifulDays;
    }

    private static int reverseInt(int n) {
        String reversedStr = new StringBuilder(String.valueOf(n)).reverse().toString();
        return Integer.parseInt(reversedStr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = solution(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
