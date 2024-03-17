import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        int[] p = new int[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for (int i = 0; i < t.length; i++) {
            if (i > 0 && max < ans[i - 1]) max = ans[i - 1];
            if (i + t[i] - 1 < t.length) {
                ans[i + t[i] - 1] = Math.max(max + p[i], ans[i + t[i] - 1]);
            }
        }
        System.out.println(Arrays.stream(ans).max().getAsInt());
    }
}