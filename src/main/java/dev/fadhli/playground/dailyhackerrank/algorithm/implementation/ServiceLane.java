package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceLane {

    public static List<Integer> solution(int n, List<List<Integer>> cases, List<Integer> width) {
        List<Integer> fitSegments = new ArrayList<>();

        for (List<Integer> c : cases) {
            int start = c.get(0);
            int end = c.get(1);

            end = Math.min(end, n - 1);

            int minSegment = Integer.MAX_VALUE;
            for (int i = start; i <= end; i++) {
                minSegment = Math.min(minSegment, width.get(i));
            }

            fitSegments.add(minSegment);
        }

        return fitSegments;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String[] firstMultipleInput = br.readLine().trim().split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int t = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> width = Arrays.stream(br.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<List<Integer>> cases = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] casesTemp = br.readLine().trim().split(" ");
            List<Integer> caseList = Arrays.stream(casesTemp)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            cases.add(caseList);
        }

        List<Integer> result = solution(n, cases, width);

        pw.println(result.stream().map(Object::toString).collect(Collectors.joining("\n")));
        pw.close();
    }

}
