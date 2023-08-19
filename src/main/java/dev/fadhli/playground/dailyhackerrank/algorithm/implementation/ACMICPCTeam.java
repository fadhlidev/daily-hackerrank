package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ACMICPCTeam {

    public static List<Integer> solution(List<String> topic) {
        int maxTwoTopics = 0;
        int maxTeams = 0;

        for (int i = 0; i < topic.size(); i++) {
            for (int j = i + 1; j < topic.size(); j++) {
                String person1 = topic.get(i);
                String person2 = topic.get(j);
                int total = 0;

                for (int t = 0; t < person1.length(); t++) {
                    if (person1.charAt(t) == '0' && person2.charAt(t) == '0') continue;
                    total++;
                }

                if (total > maxTwoTopics) {
                    maxTwoTopics = total;
                    maxTeams = 0;
                }

                if (total == maxTwoTopics) {
                    maxTeams++;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxTwoTopics);
        result.add(maxTeams);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> result = solution(topic);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
