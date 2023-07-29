package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CatAndMouse {

    private static final Scanner scanner = new Scanner(System.in);

    static String solution(int x, int y, int z) {
        int catATravels = z > x ? z - x : x - z;
        int catBTravels = z > y ? z - y : y - z;
        if (catATravels == catBTravels) return "Mouse C";
        return catATravels < catBTravels ? "Cat A" : "Cat B";
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = solution(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
