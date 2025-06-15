import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
            cnt++;
            if (sum >= h) {
                break;
            }
        }
        if (sum < h) {
            System.out.println(-1);
            return;
        }
        System.out.println(cnt);
    }
}