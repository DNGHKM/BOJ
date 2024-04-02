import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int searchRange;
    static int[] item;
    static ArrayList<ArrayList<int[]>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        searchRange = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        item = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            item[i] = Integer.parseInt(st.nextToken());
        }
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            list.get(s).add(new int[]{e, d});
            list.get(e).add(new int[]{s, d});
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int result = dijkstra(i);
            if (result > max) {
                max = result;
            }
        }
        System.out.println(max);
    }

    private static int dijkstra(int start) {
        int[] dist = new int[n + 1];
        for (int i = 0; i < dist.length; i++) {
            if (i == start) {
                dist[i] = 0;
            } else {
                dist[i] = 100;
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 1; i < dist.length; i++) {
            pq.add(new int[]{i, dist[i]});
        }
        while (!pq.isEmpty()) {
            int[] tmp = pq.poll();
            for (int[] arr : list.get(tmp[0])) {
                if(dist[arr[0]]>dist[tmp[0]] + arr[1]){
                    dist[arr[0]] = dist[tmp[0]] + arr[1];
                    pq.add(new int[]{arr[0],dist[arr[0]]});
                }
            }
        }
        int num = 0;
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] <= searchRange) num += item[i];
        }
        return num;
    }
}