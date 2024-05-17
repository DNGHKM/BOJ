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
            int before = Integer.parseInt(st.nextToken());
            int after = Integer.parseInt(st.nextToken());
            list.get(before).add(after);
            arr[after]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) pq.add(i);
        }
        while (!pq.isEmpty()) {
            Integer poll = pq.poll();
            bw.write(poll + " ");
            for (Integer next : list.get(poll)) {
                arr[next]--;
                if (arr[next] == 0) pq.add(next);
            }
        }
        bw.flush();
    }
}