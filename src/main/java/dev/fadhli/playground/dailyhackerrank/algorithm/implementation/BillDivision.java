package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BillDivision {

    public static void solution(List<Integer> bill, int k, int b) {
        int totalCost = bill.stream().reduce(0, Integer::sum);
        int sharedCost = totalCost - bill.get(k);
        int mustCharge = sharedCost / 2;
        System.out.println(b > mustCharge ? b - mustCharge : "Bon Appetit");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        solution(bill, k, b);

        bufferedReader.close();
    }

}
