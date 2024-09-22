import java.io.*;

public class Main {
    static int point = Integer.MAX_VALUE;
    static String ansTime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine().replace(":", ""));
        while (time < 10000) {
            calEffort(time);
            if (time % 100 + 60 < 100) {
                calEffort(time + 60);
            }
            time += 2400;
        }
        System.out.println(ansTime.substring(0, 2) + ":" + ansTime.substring(2, 4));
    }

    private static void calEffort(int time) {
        int sum = 0;
        String t = String.valueOf(time);
        while (t.length() < 4) {
            t = '0' + t;
        }
        int curY = 3;
        int curX = 1;
        if (t.charAt(0) != '0') {
            curY = (t.charAt(0) - '1') / 3;
            curX = (t.charAt(0) - '1') % 3;
        }
        for (int i = 1; i < t.length(); i++) {
            char c = t.charAt(i);
            int nextY = 3;
            int nextX = 1;
            if (c != '0') {
                nextY = (c - '1') / 3;
                nextX = (c - '1') % 3;
            }
            sum += Math.abs((nextY - curY)) + Math.abs((nextX - curX));
            curY = nextY;
            curX = nextX;
        }
        if (sum < point) {
            point = sum;
            ansTime = t;
        }
    }
}