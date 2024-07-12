import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[5_000_001];
        Arrays.fill(prime, true);
        prime[1] = prime[0] = false;
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = false;
            }
        }
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (prime[i]) {
                num--;
                num = Math.max(0, num);
            } else {
                num++;
            }
        }
        System.out.println(num + " " + (n-num));
    }
}