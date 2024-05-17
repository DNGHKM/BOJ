import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] arr = new int[n + 1];
            int[] time = new int[n + 1];
            int[] dpTime = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < arr.length; j++) {
                time[j] = Integer.parseInt(st.nextToken());
            }
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int j = 0; j < n + 1; j++) {
                list.add(new ArrayList<>());
            }
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int before = Integer.parseInt(st.nextToken());
                int after = Integer.parseInt(st.nextToken());
                arr[after]++;
                list.get(before).add(after);
            }
            int target = Integer.parseInt(br.readLine());
            Queue<Integer> q = new LinkedList<>();
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == 0) {
                    q.add(j);
                }
            }
            while (!q.isEmpty()) {
                Integer poll = q.poll();
                if (poll == target) {
                    break;
                }
                for (Integer next : list.get(poll)) {
                    arr[next]--;
                    dpTime[next] = Math.max(time[poll] + dpTime[poll], dpTime[next]);
                    if (arr[next] == 0) {
                        q.add(next);
                    }
                }
            }
            bw.write(time[target] + dpTime[target]+"\n");
        }
        bw.flush();
    }
}