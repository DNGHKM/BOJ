import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        long m = Long.parseLong(br.readLine());
        long ans = 0;
        for (long i : arr) {
            if (i != 0) {
                ans += (i + m - 1) / m * m;
            }
        }
        System.out.print(ans);
    }
}