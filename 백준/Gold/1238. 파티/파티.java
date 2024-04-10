import java.io.*;
import java.util.*;

class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<List<Integer>>> goList = new ArrayList<>();
        ArrayList<ArrayList<List<Integer>>> backList = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            goList.add(new ArrayList<>());
            backList.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            goList.get(s).add(List.of(e, d));
            backList.get(e).add(List.of(s, d));
        }
        int[] back = dijk(x, backList);
        int[] go = dijk(x, goList);
        for (int i = 0; i < n + 1; i++) {
            go[i] = back[i]+ go[i];
        }
        Arrays.sort(go);
        System.out.println(go[go.length - 1]);
    }

    static int[] dijk(int start, ArrayList<ArrayList<List<Integer>>> list) {
        int[] dist = new int[n + 1];
        for (int i = 0; i < dist.length; i++) {
            if (i != start) dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(1)));
        for (int i = 1; i < list.size(); i++) {
            pq.add(List.of(i, dist[i]));
        }
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