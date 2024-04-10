import java.io.*;
import java.util.*;

class Main {
    static int n;
    static ArrayList<ArrayList<List<Integer>>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
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
        }
        int[] go = new int[n + 1];
        go[0] = Integer.MAX_VALUE;
        for (int i = 1; i < n + 1; i++) {
            int[] result = dijk(i);
            go[i] = result[x];
        }
        int[] ans = dijk(x);
        for (int i = 0; i < n + 1; i++) {
            ans[i] += go[i];
        }
        Arrays.sort(ans);
        System.out.println(ans[ans.length-1]);
    }

    static int[] dijk(int start) {
        int[] dist = new int[n + 1];
        for (int i = 0; i < dist.length; i++) {
            if (i != start) dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(1)));
        for (int i = 1; i < list.size(); i++) {
            pq.add(List.of(i, dist[i]));
        }
        while(!pq.isEmpty()){
            List<Integer> poll = pq.poll();
            for (List<Integer> next : list.get(poll.get(0))) {
                if(dist[next.get(0)]>dist[poll.get(0)]+next.get(1)){
                    dist[next.get(0)]=dist[poll.get(0)]+next.get(1);
                    pq.add(List.of(next.get(0), dist[next.get(0)]));
                }
            }
        }
        return dist;
    }
}