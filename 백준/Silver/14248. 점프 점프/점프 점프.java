import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int cnt = 0;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int s = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        visited[0] = visited[s] = true;
        dfs(s);
        System.out.println(cnt);
    }

    private static void dfs(int cur) {
        cnt++;
        visited[cur] = true;
        if (1 <= cur - arr[cur] && !visited[cur - arr[cur]]) {
            dfs(cur - arr[cur]);
        }
        if (cur + arr[cur] < arr.length && !visited[cur + arr[cur]]) {
            dfs(cur + arr[cur]);
        }
    }
}