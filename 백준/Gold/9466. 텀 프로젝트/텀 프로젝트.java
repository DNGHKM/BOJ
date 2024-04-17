import java.io.*;
import java.util.*;

class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static boolean[] checked;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            visited = new boolean[n + 1];
            checked = new boolean[n + 1];
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 1; j <arr.length; j++) {
                if(!visited[j]){
                    dfs(j);
                }
            }
            bw.write(n-count+"\n");
        }
        bw.flush();
    }

    private static void dfs(int node) {
        visited[node] = true;
        int next = arr[node];
        if(!visited[next]){
            dfs(next);
        }else{
            if(!checked[next]) {
                count++;
                while (next != node) {
                    count++;
                    next = arr[next];
                }
            }
        }
        checked[node] = true;
    }
}