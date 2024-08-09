import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[100_001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < Math.sqrt(isPrime.length); i++) {
            for (int j = i + i; j < isPrime.length; j += i) {
                isPrime[j] = false;
            }
        }
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] cnt = new int[n + 1];
            int idx = 2;
            while (!isPrime[n]) {
                if (isPrime[idx] && n % idx == 0) {
                    cnt[idx]++;
                    n /= idx;
                } else {
                    idx++;
                }
            }
            cnt[n]++;
            for (int j = 0; j < cnt.length; j++) {
                if (cnt[j] != 0) {
                    bw.write(j + " " + cnt[j] + "\n");
                }
            }
        }
        bw.flush();
    }
}