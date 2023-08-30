package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations {

    private static final Scanner scanner = new Scanner(System.in);

    static int solution(int n, int[] c) {
        Arrays.sort(c);
        int maxDistance = c[0];

        for (int i = 1; i < c.length; i++) {
            int distance = (c[i] - c[i - 1]) / 2;
            maxDistance = Math.max(maxDistance, distance);
        }

        int distanceToFirstStation = c[0];
        int distanceToLastStation = n - 1 - c[c.length - 1];

        return Math.max(Math.max(distanceToFirstStation, distanceToLastStation), maxDistance);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = solution(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
