import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int[] tmp = new int[num];
            for (int j = 0; j < num; j++) {
                tmp[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < tmp.length - 1; j++) {
                int start = tmp[j];
                int end = tmp[j + 1];
                list.get(start).add(end);
                arr[end]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) q.add(i);
        }
        boolean[] visited = new boolean[n + 1];
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            visited[poll] = true;
            bw.write(poll + "\n");
            for (Integer next : list.get(poll)) {
                arr[next]--;
                if(arr[next]==0){
                    q.add(next);
                }
            }
        }
        for (int i = 1; i < visited.length; i++) {
            if(!visited[i]){
                System.out.println(0);
                return;
            }
        }
        bw.flush();
    }
}