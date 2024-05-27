import java.util.*;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        long c = sc.nextLong();
        int k = sc.nextInt();
        long[] m = new long[p];
        for (int i = 0; i < p; i++) {
            m[i] = sc.nextLong();
        }
        long[] d = new long[p];
        for (int i = 1; i < p; i++) {
            d[i] = m[i] - m[i - 1];
        }
        long sum = 0, num = c;
        for (int i = 1; i < p; i++) {
            sum += -num * d[p - i];
            if (sum >= 0) {
                sum %= MOD;
            } else {
                sum = -(-sum % MOD);
            }
            num *= c;
            num %= MOD;
        }

        long[] dArray = new long[d.length + 1];
        System.arraycopy(d, 0, dArray, 0, d.length);
        dArray[dArray.length - 1] = sum;
        long ans = Math.abs(dArray[(k - 1) % p + 1]);
        int iter = (k - 1) / p;
        while (--iter >= 0) {
            ans *= num;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}