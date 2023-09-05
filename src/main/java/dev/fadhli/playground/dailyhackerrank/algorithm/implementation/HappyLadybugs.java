package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class HappyLadybugs {

    public static String solution(String b) {
        List<Character> boards = b.chars().mapToObj(c -> (char) c).collect(toList());
        boolean hasEmptyBoard = boards.contains('_');

        if (hasEmptyBoard) {
            Set<Character> colors = boards.stream()
                    .filter(board -> board != '_')
                    .collect(toSet());

            for (char color : colors) {
                long sameColorCount = boards.stream()
                        .filter(board -> board == color)
                        .count();

                if (sameColorCount < 2) return "NO";
            }
        } else {
            for (int i = 0; i < boards.size(); i++) {
                boolean left = i > 0 && Objects.equals(boards.get(i - 1), boards.get(i));
                boolean right = i < boards.size() - 1 && Objects.equals(boards.get(i + 1), boards.get(i));
                if (!left && !right) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = solution(b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }

}
