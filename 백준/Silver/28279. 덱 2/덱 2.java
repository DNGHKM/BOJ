import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            if (input == 1) {
                int input2 = Integer.parseInt(st.nextToken());
                deq.addFirst(input2);
            } else if (input == 2) {
                int input2 = Integer.parseInt(st.nextToken());
                deq.addLast(input2);
            } else if (input == 3) {
                if (deq.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(deq.pollFirst() + "\n");
                }
            } else if (input == 4) {
                if (deq.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(deq.pollLast() + "\n");
                }
            } else if (input == 5) {
                sb.append(deq.size() + "\n");
            } else if (input == 6) {
                if (deq.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (input == 7) {
                if (!deq.isEmpty()) {
                    sb.append(deq.peekFirst() + "\n");
                } else {
                    sb.append(-1 + "\n");
                }
            } else if (input == 8) {
                if (!deq.isEmpty()) {
                    sb.append(deq.peekLast() + "\n");
                } else {
                    sb.append(-1 + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}