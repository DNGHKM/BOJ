import java.io.*;
import java.util.*;

public class Main {
    static int a;
    static int b;
    static int d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[b - a + 1];
        Arrays.fill(prime, true);
        if (a == 1) {
            prime[0] = false;
        }
        for (int i = 2; i < Math.sqrt(b) + 1; i++) {
            for (int j = i * 2; j <= b; j += i) {
                if (j < a) {
                    continue;
                }
                prime[j - a] = false;
            }
        }
        System.out.println(findNum(prime));
    }

    private static int findNum(boolean[] prime) {
        int num = 0;
        for (int i = a; i <= b; i++) {
            int cur = i;
            if (!prime[cur-a]) {
                continue;
            }
            while (cur > 0) {
                if (cur % 10 == d) {
                    num++;
                    break;
                }
                cur/=10;
            }
        }
        return num;
    }
}