import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            pq.add(num);
            sum += num;
        }
        for (int i = 0; i < n; i++) {
            if(pq.isEmpty()){
                break;
            }
            Integer num = pq.poll();
            if ((i + 1) % 3 == 0) {
                sum -= num;
            }
        }
        System.out.println(sum);
    }
}