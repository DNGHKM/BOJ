import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(st.nextToken()));
        }
        int count = 0;
        while (!pq.isEmpty()) {
            count++;
            int size = 0;
            Queue<Integer> q = new LinkedList<>();
            while (!pq.isEmpty()) {
                if (pq.peek() >= size) {
                    pq.poll();
                    size++;
                } else {
                    q.add(pq.poll());
                }
            }
            while (!q.isEmpty()) pq.add(q.poll());
        }
        System.out.println(count);
    }
}