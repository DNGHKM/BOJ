import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }
        int[] coin = new int[set.size()];
        int idx = 0;
        for (Integer i : set) {
            coin[idx] = i;
            idx++;
        }
        int[] dp = new int[k + 1];
        Arrays.fill(dp, 10001);
        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j < dp.length; j++) {
                if (j % coin[i] == 0) {
                    dp[j] = Math.min(dp[j], j / coin[i]);
                }
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }
        if(dp[k]==10001){
            System.out.println(-1);
        }else {
            System.out.println(dp[k]);
        }
    }
}