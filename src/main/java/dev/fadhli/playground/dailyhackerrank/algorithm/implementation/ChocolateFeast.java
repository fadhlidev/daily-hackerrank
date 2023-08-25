package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.stream.IntStream;

public class ChocolateFeast {

    public static int solution(int n, int c, int m) {
        int chocolates = n / c;
        int wrappers = 0;
        int total = 0;

        while (chocolates > 0) {
            total += chocolates;
            wrappers += chocolates;
            chocolates = wrappers / m;
            wrappers %= m;
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int c = Integer.parseInt(firstMultipleInput[1]);

                int m = Integer.parseInt(firstMultipleInput[2]);

                int result = solution(n, c, m);

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
