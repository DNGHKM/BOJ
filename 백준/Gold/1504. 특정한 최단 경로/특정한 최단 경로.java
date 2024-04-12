import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//4 6
//        1 2 3
//        2 3 3
//        3 4 1
//        1 3 5
//        2 4 5
//        1 4 4
//        2 3
class Main {
    static int n;
    static ArrayList<List<List<Integer>>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            list.get(s).add(List.of(e, d));
            list.get(e).add(List.of(s, d));
        }
        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        int[] dijk1 = dijk(1);
        int[] dijkV1 = dijk(v1);
        int[] dijkV2 = dijk(v2);
        int result1 = dijk1[v1] + dijkV1[v2] + dijkV2[n];
        int result2 = dijk1[v2] + dijkV2[v1] + dijkV1[n];
        int ans = 0;
        if (Math.abs(result1) > 2_000_000_000 && Math.abs(result2) > 2_000_000_000) {
            ans = -1;
        } else {
            ans = Math.min(result1, result2);
        }
        System.out.println(ans);
    }

    static int[] dijk(int start) {
        int[] dist = new int[n + 1];
        for (int i = 0; i < dist.length; i++) {
            if (i == start) continue;
            dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1) - o2.get(1);
            }
        });
        pq.add(List.of(start, dist[start]));
        while (!pq.isEmpty()) {
            List<Integer> poll = pq.poll();
            for (List<Integer> next : list.get(poll.get(0))) {
                if (dist[next.get(0)] > dist[poll.get(0)] + next.get(1)) {
                    dist[next.get(0)] = dist[poll.get(0)] + next.get(1);
                    pq.add(List.of(next.get(0), dist[next.get(0)]));
                }
            }
        }
        return dist;
    }
}