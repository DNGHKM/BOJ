import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean[] visited = new boolean[n];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0] = true;
        int ans = -1;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            if (poll[0] == n - 1) {
                ans = poll[1];
                break;
            }
            for (int i = poll[0] + 1; i < poll[0] + 1 + arr[poll[0]]; i++) {
                if (i >= n) {
                    continue;
                }
                if (!visited[i]) {
                    q.add(new int[]{i, poll[1] + 1});
                    visited[i] = true;
                }
            }
        }
        System.out.println(ans);
    }
}