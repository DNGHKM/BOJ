import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            pq.add(new int[]{s, e, d});
        }
        parent = new int[n + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (count < n - 1) {
            int[] poll = pq.poll();
            int start = poll[0];
            int end = poll[1];
            int dist = poll[2];
            if (find(start) != find(end)) {
                ans.add(dist);
                count++;
                union(start, end);
            }
        }
        System.out.println(ans.stream().mapToInt(Integer::intValue).sum() - ans.stream().mapToInt(Integer::intValue).max().getAsInt());
    }

    static void union(int start, int end) {
        int startParent = find(start);
        int endParent = find(end);
        if (startParent < endParent) {
            parent[endParent] = startParent;
        } else {
            parent[startParent] = endParent;
        }
    }

    static int find(int num) {
        if (parent[num] == num) {
            return num;
        }
        return parent[num] = find(parent[num]);
    }
}