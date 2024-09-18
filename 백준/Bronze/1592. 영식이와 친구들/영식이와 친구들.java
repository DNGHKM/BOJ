import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        if(m==1){
            System.out.println(0);
            return;
        }
        int[] arr = new int[n + 1];
        int cur = 1;
        arr[1] = 1;
        int cnt = 1;
        while (true) {
            int next;
            if (arr[cur] % 2 == 1) {
                next = cur + l;
            } else {
                next = cur - l;
            }
            if (next >= arr.length-1) {
                next -= arr.length-1;
            }
            if (next <= 0) {
                next += arr.length-1;
            }
            int num = ++arr[next];
            if (num == m) break;
            cnt++;
            cur = next;
        }
        System.out.println(cnt);
    }
}