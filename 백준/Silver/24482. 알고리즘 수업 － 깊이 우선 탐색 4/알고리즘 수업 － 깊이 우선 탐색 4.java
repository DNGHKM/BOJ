import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static ArrayList<PriorityQueue<Integer>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        visited = new boolean[n + 1];
        list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new PriorityQueue<>(Comparator.reverseOrder()));
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }
        dfs(r, 0);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 && i != r) {
                sb.append(-1 + "\n");
                continue;
            }
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb);
    }

    static void dfs(int cur, int deep) {
        visited[cur] = true;
        arr[cur] = deep;
        while(!list.get(cur).isEmpty()){
            Integer num = list.get(cur).poll();
            if (!visited[num]) {
                dfs(num, deep + 1);
            }
        }
    }
}