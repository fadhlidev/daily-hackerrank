package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CavityMap {

    public static List<String> solution(List<String> grid) {
        int numRows = grid.size();
        if (numRows <= 2) {
            return grid;
        }

        List<String> result = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            StringBuilder rowBuilder = new StringBuilder(grid.get(i));

            if (i == 0 || i == numRows - 1) {
                result.add(rowBuilder.toString());
                continue;
            }

            for (int j = 1; j < rowBuilder.length() - 1; j++) {
                char cell = rowBuilder.charAt(j);
                char[] edges = {
                        grid.get(i - 1).charAt(j),
                        grid.get(i + 1).charAt(j),
                        rowBuilder.charAt(j - 1),
                        rowBuilder.charAt(j + 1)
                };

                char max = '0';
                for (char edge : edges) {
                    if (edge > max) {
                        max = edge;
                    }
                }

                if (cell > max) {
                    rowBuilder.setCharAt(j, 'X');
                }
            }

            result.add(rowBuilder.toString());
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = solution(grid);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
