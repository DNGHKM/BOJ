import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        final int MOD = 1_000_000_007;
        long ans = 1;
        for (int i = 1; i < n; i++) {
            ans = (ans % MOD * num % MOD) % MOD;
            num--;
        }
        System.out.println(ans);
    }
}