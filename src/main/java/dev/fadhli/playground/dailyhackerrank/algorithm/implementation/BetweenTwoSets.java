package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BetweenTwoSets {

    public static int solution(List<Integer> a, List<Integer> b) {
        int lcm = calculateLCM(a);
        int gcd = calculateGCD(b);

        int count = 0;
        for (int i = lcm; i <= gcd; i += lcm) {
            if (gcd % i == 0) {
                count++;
            }
        }

        return count;
    }

    private static int calculateLCM(List<Integer> array) {
        int lcm = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            lcm = calculateLCM(lcm, array.get(i));
        }
        return lcm;
    }

    private static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    private static int calculateGCD(List<Integer> array) {
        int gcd = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            gcd = calculateGCD(gcd, array.get(i));
            if (gcd == 1) break;
        }
        return gcd;
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = solution(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
