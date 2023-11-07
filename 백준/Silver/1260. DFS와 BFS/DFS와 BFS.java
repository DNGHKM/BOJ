import java.io.*;
        import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }
        for (int i = 0; i <n+1; i++) {
            list.get(i).sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            });
        }
        boolean[] visited = new boolean[n + 1];
        DFS(list, visited, v);
        System.out.println();
        visited = new boolean[n + 1];
        BFS(list, visited, v);
    }
    private static void DFS(ArrayList<ArrayList<Integer>> list, boolean[] visited, int v) {
        System.out.print(v + " ");
        visited[v] = true;
        for (int a : list.get(v)) {
            if (!visited[a]) {
                DFS(list, visited, a);
                visited[a] = true;
            }
        }
    }
    private static void BFS(ArrayList<ArrayList<Integer>> list, boolean[] visited, int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            int tmp = q.poll();
            System.out.print(tmp + " ");
            for (int a : list.get(tmp)) {
                if (!visited[a]) {
                    q.add(a);
                    visited[a] = true;
                }
            }
        }
    }
}