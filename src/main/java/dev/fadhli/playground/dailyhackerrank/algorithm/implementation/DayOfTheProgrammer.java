package dev.fadhli.playground.dailyhackerrank.algorithm.implementation;

import java.io.*;

public class DayOfTheProgrammer {

    public static String solution(int year) {
        String day = year == 1918 ? "26" : isLeapYear(year) ? "12" : "13";
        return day + ".09." + year;
    }

    private static boolean isJulianCalendar(int year) {
        return year < 1919;
    }

    private static boolean isLeapYear(int year) {
        return isJulianCalendar(year) ? year % 4 == 0 : year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = solution(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
