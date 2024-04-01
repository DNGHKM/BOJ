import java.io.*;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<int[]>> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            while (true) {
                int e = Integer.parseInt(st.nextToken());
                if (e == -1) {
                    break;
                }
                int d = Integer.parseInt(st.nextToken());
                list.get(s).add(new int[]{e, d});
            }
        }
        int[] first = bfs(1, list);
        int farNode = first[0];
        int[] second = bfs(farNode, list);
        System.out.println(second[1]);
    }

    static int[] bfs(int i, ArrayList<ArrayList<int[]>> list) {
        boolean[] visited = new boolean[n + 1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, 0});
        visited[i] = true;
        int[] result = new int[2];
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            int node = tmp[0];
            int distance = tmp[1];
            if (result[1] < distance) {
                result[1] = distance;
                result[0] = node;
            }
            for (int[] arr : list.get(node)) {
                int nextNode = arr[0];
                int nextDistance = arr[1] + distance;
                if (!visited[nextNode]) {
                    q.add(new int[]{nextNode, nextDistance});
                    visited[nextNode] = true;
                }
            }
        }
        return result;
    }
}