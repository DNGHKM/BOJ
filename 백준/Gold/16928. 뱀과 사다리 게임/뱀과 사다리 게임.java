import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < x + y; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        int[] dist = new int[101];
        boolean[] visited = new boolean[101];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        dist[1] = 0;
        visited[1] = true;

        while (!q.isEmpty()) {
            Integer curr = q.poll();

            for (int i = 1; i <= 6; i++) {
                int next = curr + i;

                Integer jump = map.get(next);
                if (jump != null && !visited[jump]) {
                    q.add(jump);
                    visited[jump] = true;
                    dist[jump] = dist[curr] + 1;
                    continue;
                }

                if (next > 100) {
                    continue;
                }

                if (!visited[next] && jump == null) {
                    dist[next] = dist[curr] + 1;
                    q.add(next);
                    visited[next] = true;
                }
            }
        }
        System.out.println(dist[100]);
    }
}