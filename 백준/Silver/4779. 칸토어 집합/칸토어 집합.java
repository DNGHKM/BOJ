import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String s = br.readLine();
            if (s == null||s.isBlank()) break;
            int n = Integer.parseInt(s);
            sb = new StringBuilder();
            for (int i = 0; i < Math.pow(3, n); i++) {
                sb.append("-");
            }
            foo(0, (int) Math.pow(3, n) - 1);
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
    }

    private static void foo(int s, int e) {
        int len = e - s + 1;
        if (len == 1) return;
        sb.replace(s + len / 3, s + len / 3 * 2, " ".repeat(Math.max(0, len / 3)));
        foo(s, s + len / 3 - 1);
        foo(e - len / 3 + 1, e);
    }
}
