package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class StrangeCounter {

    public static long solution(long t) {
        long n = 0;
        long range, lowerLimit, upperLimit;

        do {
            range = 3 * (long) Math.pow(2, n);
            lowerLimit = range - 2;
            upperLimit = lowerLimit + range - 1;
            n++;
        } while (t > upperLimit);

        long position = t - lowerLimit;
        return range - position;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        long result = solution(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
