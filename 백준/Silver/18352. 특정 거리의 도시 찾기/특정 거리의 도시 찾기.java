import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] dist = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;
        while (!q.isEmpty()) {
            int tmp = q.poll();
            for (Integer a : list.get(tmp)) {
                if (!visited[a]) {
                    q.add(a);
                    visited[a] = true;
                    dist[a] = dist[tmp] + 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == k) {
                sb.append(i).append("\n");
                count++;
            }
        }
        if (count==0) sb.append(-1);
        System.out.println(sb);
    }
}