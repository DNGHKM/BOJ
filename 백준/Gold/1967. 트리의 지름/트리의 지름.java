import java.io.*;
import java.util.*;

class Main {
    static int n;
    static ArrayList<List<int[]>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            list.get(s).add(new int[]{e, d});
            list.get(e).add(new int[]{s, d});
        }
        System.out.print(dfs(dfs(1)[0])[1]);
    }

    private static int[] dfs(int i) {
        int[] dist = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        stack.add(i);
        visited[i] = true;
        while (!stack.isEmpty()) {
            Integer tmp = stack.pop();
            for (int[] ints : list.get(tmp)) {
                if (!visited[ints[0]]) {
                    stack.add(ints[0]);
                    visited[ints[0]] = true;
                    dist[ints[0]] = dist[tmp] + ints[1];
                }
            }
        }
        int farNode = 0;
        int farDist = 0;
        for (int j = 0; j < dist.length; j++) {
            if (farDist < dist[j]) {
                farDist = dist[j];
                farNode = j;
            }
        }
        return new int[]{farNode, farDist};
    }
}