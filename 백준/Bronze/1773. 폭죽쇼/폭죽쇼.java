import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[c + 1];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(br.readLine());
            for (int j = time; j <= c; j += time) {
                if (visited[j]) {
                    continue;
                }
                visited[j] = true;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}