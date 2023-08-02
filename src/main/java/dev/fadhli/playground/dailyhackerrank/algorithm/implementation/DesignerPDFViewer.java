package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DesignerPDFViewer {

    public static int solution(List<Integer> h, String word) {
        Map<String, Integer> alphabetMap = generateAlphabetMap();
        List<Integer> wordHeights = getWordHeights(h, word, alphabetMap);
        int maxHeight = Collections.max(wordHeights);
        return word.length() * maxHeight;
    }

    private static Map<String, Integer> generateAlphabetMap() {
        Map<String, Integer> alphabetMap = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            char letter = alphabet.charAt(i);
            alphabetMap.put(String.valueOf(letter), i);
        }

        return alphabetMap;
    }

    private static List<Integer> getWordHeights(List<Integer> heights, String word, Map<String, Integer> alphabetMap) {
        List<Integer> wordHeights = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            int alphabetValue = alphabetMap.get(String.valueOf(word.charAt(i)));
            wordHeights.add(heights.get(alphabetValue));
        }

        return wordHeights;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String word = bufferedReader.readLine();

        int result = solution(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
