import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] sum = new long[n + 1];
        long[] rest = new long[m];
        long count = 0;
        st = new StringTokenizer(br.readLine());
        sum[1] = Integer.parseInt(st.nextToken());
        for (int i = 2; i < sum.length; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < sum.length; i++) {
            rest[(int) (sum[i] % m)]++;
        }
        count += rest[0];
        for (long i : rest) {
            count += i * (i - 1) / 2;
        }
        System.out.println(count);
    }
}