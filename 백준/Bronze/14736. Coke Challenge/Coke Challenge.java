import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int sum = 0;
            int time = 0;
            while (sum < k) {
                sum += a;
                time++;
                if (sum >= k) {
                    break;
                }
                if (sum % (t * a) == 0) {
                    time += s;
                }
            }
            ans = Math.min(ans, time);
        }
        System.out.println(ans);
    }
}