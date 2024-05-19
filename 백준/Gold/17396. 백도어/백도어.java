import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static long[] time;
    static long INF = Long.MAX_VALUE;
    static ArrayList<ArrayList<int[]>> list;
    static boolean[] alive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        time = new long[n];
        Arrays.fill(time, INF);
        time[0] = 0;
        alive = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < alive.length; i++) {
            if (Integer.parseInt(st.nextToken()) == 0) {
                alive[i] = true;
            }
        }
        alive[n - 1] = true;
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            list.get(s).add(new int[]{e, t});
            list.get(e).add(new int[]{s, t});
        }
        long ans = dijk();
        if (ans == INF) ans = -1;
        System.out.print(ans);
    }

    private static long dijk() {
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(o -> o[1]));
        pq.add(new long[]{0, 0});
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            int curNode = (int) cur[0];
            int curTime = (int) cur[1];
            if(time[curNode]<curTime) continue;
            if(!alive[curNode]) continue;
            for (int[] next : list.get(curNode)) {
                if (alive[next[0]]) {
                    int nextNode = next[0];
                    int nextTime = next[1];
                    if (time[nextNode] > time[curNode] + nextTime) {
                        time[nextNode] = time[curNode] + nextTime;
                        pq.add(new long[]{nextNode, time[nextNode]});
                    }
                }
            }
        }
        return time[n - 1];
    }
}