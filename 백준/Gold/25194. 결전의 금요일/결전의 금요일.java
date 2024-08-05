import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[7];
        visited[0] = true;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken()) % 7;
            if (num == 4) {
                System.out.println("YES");
                return;
            }
            if (num != 0) {
                q.add(num);
            }
        }
        while (!q.isEmpty()) {
            int poll = q.poll();
            boolean[] newVisited = new boolean[7];
            System.arraycopy(visited, 0, newVisited, 0, 7);
            for (int i = 0; i < 7; i++) {
                if (newVisited[i]) {
                    visited[(i + poll) % 7] = true;
                }
            }
            visited[poll] = true;
            if (visited[4]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
