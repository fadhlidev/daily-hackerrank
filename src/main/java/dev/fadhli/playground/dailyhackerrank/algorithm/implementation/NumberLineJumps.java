package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class NumberLineJumps {

    public static String solution(int x1, int v1, int x2, int v2) {
        try {
            if (x1 > x2 && v1 > v2) return "NO";
            if (x1 < x2 && v1 < v2) return "NO";
            if (x1 == x2) return "NO";

            // These can cause divide by zero exception
            if ((x2 - x1) % (v1 - v2) == 0) return "YES";
            if ((x2 - x1) % (v2 - v1) == 0) return "YES";
        } catch (ArithmeticException e) {}

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = solution(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
