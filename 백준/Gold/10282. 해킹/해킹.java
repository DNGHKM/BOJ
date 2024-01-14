import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int nodes = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            int inf = 2_000_000_000;
            boolean[] visited = new boolean[n+1];
            visited[start] = visited[0] = true;
            ArrayList<ArrayList<int[]>> list = new ArrayList<>();
            for (int j = 0; j <=n; j++) {
                list.add(new ArrayList<>());
            }
            for (int j = 0; j <nodes; j++) {
                st=new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                list.get(b).add(new int[]{a,s});
            }
            int[] dist = new int[n+1];
            for (int j = 0; j < dist.length; j++) {
                if (j == start) {
                    dist[j] = 0;
                } else {
                    dist[j] = inf;
                }
            }
            for (int[] pair : list.get(start)) {
                dist[pair[0]] = pair[1];
            }
            for (int j = 0; j <n-1; j++) {
                int current = min(dist, visited);
                for (int[] pair : list.get(current)) {
                    if(!visited[current]&&dist[pair[0]]>dist[current]+pair[1]){
                        dist[pair[0]]=dist[current]+pair[1];
                    }
                }
                visited[current] = true;
            }
            int count = 0;
            int max = 0;
            for (int a : dist) {
                if(a<inf){
                    count++;
                }
                if(a<inf&&a>max){
                    max = a;
                }
            }
            bw.write(count+" "+max+"\n");
        }
        bw.flush();
    }
    static int min(int[] dist, boolean[] visited){
        int minimum = 0;
        for (int i = 0; i<dist.length; i++) {
            if(!visited[i]&&dist[i]<dist[minimum]){
                minimum = i;
            }
        }
        return minimum;
    }
}