import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        long[] time = new long[n + 1];
        long[] dpTime = new long[n + 1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 1; i < n + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            while (true) {
                int num = Integer.parseInt(st.nextToken());
                if (num == -1) {
                    break;
                }
                list.get(num).add(i);
                arr[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) q.add(i);
        }
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (Integer i : list.get(poll)) {
                arr[i]--;
                dpTime[i] = Math.max(dpTime[i], dpTime[poll] + time[poll]);
                if (arr[i] == 0) {
                    q.add(i);
                }
            }
        }
        for (int i = 1; i < time.length; i++) {
            bw.write((dpTime[i] + time[i]) + "\n");
        }
        bw.flush();
    }
}