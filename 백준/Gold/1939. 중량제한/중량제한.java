import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<Map<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new HashMap<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int limit = Integer.parseInt(st.nextToken());
            if (!list.get(s).containsKey(e) || list.get(s).get(e) < limit) {
                list.get(s).put(e, limit);
                list.get(e).put(s, limit);
            }
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int[] weight = new int[n + 1];
        Arrays.fill(weight, -1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(weight[b], weight[a]));

        weight[start] = Integer.MAX_VALUE;
        pq.add(start);
        while (!pq.isEmpty()) {
            Integer curr = pq.poll();
            for (Integer next : list.get(curr).keySet()) {
                int limit = list.get(curr).get(next);
                int minWeight = Math.min(weight[curr], limit);
                if (weight[next] < minWeight) {
                    weight[next] = minWeight;
                    pq.add(next);
                }
            }
        }
        System.out.println(weight[end]);
    }
}
