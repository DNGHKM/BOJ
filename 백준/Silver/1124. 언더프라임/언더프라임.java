import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[m + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = false;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < prime.length; i++) {
            if(prime[i]) list.add(i);
        }
        int ans = 0;
        for (int i = n; i <= m; i++) {
            int count = 0;
            int num = i;
            while (num > 1) {
                for (Integer j : list) {
                    if (num % j == 0) {
                        num /= j;
                        count++;
                        break;
                    }
                }
            }
            if (prime[count]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}