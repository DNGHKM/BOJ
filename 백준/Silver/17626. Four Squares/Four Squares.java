import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> squareList = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squareList.add(i * i);
        }
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int sq : squareList) {
                if (sq > i) break;
                dp[i] = Math.min(dp[i], dp[i - sq] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}