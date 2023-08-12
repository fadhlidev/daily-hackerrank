package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class AppendAndDelete {

    public static String solution(String s, String t, int k) {
        if (t.length() > s.length() && k >= t.length()) return "No";

        int startIndex = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) startIndex++;
            else break;
        }

        int deleteOperation = s.length() - startIndex;
        int appendOperation =  t.length() - startIndex;
        int totalOperation = deleteOperation + appendOperation;

        if (totalOperation > k) return "No";
        return "Yes";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = solution(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
