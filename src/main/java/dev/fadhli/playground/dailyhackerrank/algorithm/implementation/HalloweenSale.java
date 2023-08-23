package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class HalloweenSale {

    public static int solution(int p, int d, int m, int s) {
        int games = 0;
        int totalPrice = 0;

        while (totalPrice <= s) {
            int price = p - games * d;
            if (price < m) price = m;
            totalPrice += price;
            games++;
        }

        return games - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int p = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        int m = Integer.parseInt(firstMultipleInput[2]);

        int s = Integer.parseInt(firstMultipleInput[3]);

        int answer = solution(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
