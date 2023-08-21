package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModifiedKaprekarNumbers {

    public static void solution(int p, int q) {
        List<Integer> list = new ArrayList<>();
        for (int number = p; number <= q; number++) {
            long square = (long) number * number;
            String squareString = String.valueOf(square);
            int digits = squareString.length();
            int middle = digits / 2;
            int leftPart = parseIntOrZero(squareString.substring(0, middle));
            int rightPart = parseIntOrZero(squareString.substring(middle));
            if (leftPart + rightPart == number) {
                list.add(number);
            }
        }

        if (!list.isEmpty()) {
            String result = list.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.println(result);
        } else {
            System.out.println("INVALID RANGE");
        }
    }

    private static Integer parseIntOrZero(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        solution(p, q);

        bufferedReader.close();
    }

}
