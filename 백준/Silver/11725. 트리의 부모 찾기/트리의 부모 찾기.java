import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i <n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }
        int[] parent = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        q.add(1);
        while(!q.isEmpty()){
            int tmp = q.poll();
            for (int i : list.get(tmp)) {
                if(!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    parent[i] = tmp;
                }
            }
        }
        for (int i = 2; i <parent.length; i++) {
            bw.write(parent[i]+"\n");
        }
        bw.flush();
    }
}