import java.io.*;
import java.util.*;

class Main {
    static int n;
    static ArrayList<ArrayList<Node>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            boolean duplicate = false;
            for (Node node : list.get(s)) {
                if(node.end==e) {
                    duplicate = true;
                    if(node.distance>d){
                        node.distance = d;
                    }
                }
            }
            if(!duplicate) list.get(s).add(new Node(e, d));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int[] result = dijk(start);
        System.out.println(result[end]);
    }

    private static int[] dijk(int start) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        int[] dist = new int[n + 1];
        for (int i = 0; i < dist.length; i++) {
            if (i != start) dist[i] = 1_000_000_000;
        }
        pq.add(new int[]{start, dist[0]});
        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            for (Node node : list.get(poll[0])) {
                if (dist[node.end] > dist[poll[0]] + node.distance) {
                    dist[node.end] = dist[poll[0]] + node.distance;
                    pq.add(new int[]{node.end, dist[node.end]});
                }
            }
        }
        return dist;
    }
}
class Node{
    int end;
    int distance;

    public Node(int end, int distance) {
        this.end = end;
        this.distance = distance;
    }
}
