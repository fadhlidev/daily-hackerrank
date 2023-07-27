package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class CountingValleys {

    public static int solution(int steps, String path) {
        int valleyCounter = 0, position = 0;
        boolean enterValley = false;

        for (int i = 0; i < steps; i++) {
            switch (path.charAt(i)) {
                case 'D':
                    position--;
                    break;
                case 'U':
                    position++;
                    break;
                default:
                    throw new RuntimeException("Invalid path");
            }

            if (position < 0) {
                enterValley = true;
                continue;
            }

            if (enterValley && position == 0) {
                enterValley = false;
                valleyCounter++;
            }
        }

        return valleyCounter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = solution(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
