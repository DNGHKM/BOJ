import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int no1 = Integer.parseInt(br.readLine());
        for (int i = 0; i <n-1; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int ans = 0;
        while (!pq.isEmpty()&&no1 <= pq.peek()) {
            int tmp = pq.poll();
            if (tmp >= no1) {
                no1++;
                pq.add(--tmp);
                ans++;
            }
        }
        System.out.print(ans);
    }
}