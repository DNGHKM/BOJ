import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }
        for (int i = 0; i <m; i++) {
            long tmp = pq.poll()+pq.poll();
            pq.add(tmp);
            pq.add(tmp);
        }
        Stream<Long> stream = pq.stream();
        long ans = stream.reduce(0L,Long::sum);
        System.out.print(ans);
    }
}