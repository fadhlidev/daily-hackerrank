package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class DrawingBook {

    public static int solution(int n, int p) {
        int totalPages = (int) Math.floor((double) n / 2) + 1;
        int targetPage = (int) Math.floor((double) p / 2) + 1;
        int flipFromLeft = targetPage - 1;
        int flipFromRight = totalPages - targetPage;
        return Math.min(flipFromLeft, flipFromRight);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = solution(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
