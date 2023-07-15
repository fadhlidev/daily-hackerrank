package dev.fadhli.playground.dailyhackerrank.algorithm.warmup;

import java.io.*;

public class TimeConversion {

    public static String solution(String s) {
        String time = s.substring(0, 8);
        String meridiem = s.substring(8);

        if (meridiem.equals("AM")) {
            if (time.equals("12:00:00"))
                return "00:00:00";

            String hour = time.substring(0, 2);
            if (hour.equals("12"))
                return "00" + time.substring(2);

            return time;
        } else {
            if (time.equals("12:00:00"))
                return "12:00:00";

            String hour = time.substring(0, 2);
            if (hour.equals("12"))
                return time;

            int pmHour = Integer.parseInt(hour) + 12;
            return pmHour + time.substring(2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = solution(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
