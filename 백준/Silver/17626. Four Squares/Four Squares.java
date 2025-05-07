import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> squareList = new ArrayList<>();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 5);
        dp[1] = 1;
        for (int i = 1; i < dp.length; i++) {
            if (isSquareNumber(i)) {
                squareList.add(i);
                dp[i] = 1;
                continue;
            }
            for (Integer sq : squareList) {
                int sum = dp[sq] + dp[i - sq];
                if (sum < dp[i]) {
                    dp[i] = sum;
                }
            }
        }
        System.out.println(dp[n]);
    }

    private static boolean isSquareNumber(int i) {
        int sqrt = (int) Math.sqrt(i);
        return sqrt * sqrt == i;
    }
}