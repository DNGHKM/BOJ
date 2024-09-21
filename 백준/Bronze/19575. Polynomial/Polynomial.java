import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        final int MOD = 1000000007;
        long ans = 1;
        for (int i = 0; i < n + 1; i++) {
            int num = Integer.parseInt(br.readLine().split(" ")[0]);
            if (i == 0) {
                ans = num;
                continue;
            }
            ans = (ans * m) % MOD + num;
        }
        System.out.print(ans);
    }
}