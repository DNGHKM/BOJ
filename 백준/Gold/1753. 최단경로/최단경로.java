import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] dist;
    static ArrayList<ArrayList<int[]>> list;
    static final int inf = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodes = Integer.parseInt(st.nextToken());
        int edges = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        visited = new boolean[nodes + 1];
        visited[start] = visited[0] = true;
        list = new ArrayList<>();
        for (int i = 0; i <=nodes; i++) {
            list.add(new ArrayList<>());
        }
        dist = new int[nodes+1];
        for (int i = 0; i <dist.length; i++) {
            if(i==start){
                dist[i] = 0;
            }else{
                dist[i] = inf;
            }
        }
        for (int i = 0; i <edges; i++) {
            st= new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            list.get(s).add(new int[]{e, d});
            if(s==start){
                if(d<dist[e]) {
                    dist[e] = d;
                }
            }
        }
        for (int i = 2; i <nodes; i++) {
            dijk();
        }
        for (int i = 1; i <=nodes; i++) {
            if (dist[i] != inf) {
                bw.write(dist[i] + "\n");
            } else{
                bw.write("INF\n");
            }
        }
        bw.flush();
    }

    private static void dijk() {
        int index = min(dist, visited);
        for (int[] ints : list.get(index)) {
            if(dist[index]+ints[1]<dist[ints[0]]){
                dist[ints[0]]=dist[index]+ints[1];
            }
        }
        visited[index] = true;
    }

    private static int min(int[] dist, boolean[] visited) {
        int min = 0;
        for (int i = 0; i <dist.length; i++) {
            if(!visited[i]&&dist[i]<dist[min]){
                min = i;
            }
        }
        return min;
    }
}