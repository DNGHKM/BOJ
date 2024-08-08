import java.io.*;
import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            boolean[] visited = new boolean[n];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    visited[j] = true;
                    cnt++;
                    if (cnt == i) break;
                }
            }
            if (cnt < i) break;
            for (int j = 0; j < arr.length; j++) {
                if (!visited[j] && arr[j] > i) {
                    break;
                }
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}