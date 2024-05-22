import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dp = new int[k + 1];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num>k){
                continue;
            }
            dp[num]++;
            for (int j = num+1; j <dp.length; j++) {
                dp[j] = dp[j] + dp[j - num];
            }
        }
        System.out.println(dp[k]);
    }
}