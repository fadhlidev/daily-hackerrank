package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class ViralAdvertising {

    public static int solution(int n) {
        int cumulativeLikes = 0;
        int currentShared = 5;

        for (int i = 1; i <= n; i++) {
            int likes = (int) Math.floor((double) currentShared / 2);
            currentShared = likes * 3;
            cumulativeLikes += likes;
        }

        return cumulativeLikes;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = solution(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
