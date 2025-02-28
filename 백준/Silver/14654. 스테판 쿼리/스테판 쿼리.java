import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        int max = 0;
        char cur = '-';
        for (int i = 0; i < n; i++) {
            char result = rcp(a[i], b[i]);
            if (result == '0') {
                cur = (cur == 'a') ? 'b' : 'a';
                cnt = 1;
                continue;
            }
            if (result != cur) {
                cnt = 0;
            }
            cnt++;
            max = Math.max(max, cnt);
            cur = result;
        }
        System.out.println(max);
    }

    private static char rcp(int a, int b) {
        if (a == b) {
            return '0';
        }

        if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
            return 'a';
        }

        return 'b';
    }
}
