import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            al.add(Integer.parseInt(st.nextToken()));
            deq.add(i+1);
        }
        int num = deq.pollFirst();
        int index = al.get(num-1);
        sb.append(1+"\n");
        while(!deq.isEmpty()) {
            for (int i = 0; i < Math.abs(index); i++) {
                int tmp;
                if (index > 0) {
                    tmp = deq.pollFirst();
                    deq.addLast(tmp);
                } else {
                    tmp = deq.pollLast();
                    deq.addFirst(tmp);
                }
            }
            if (index > 0) {
                index = al.get(deq.getLast() - 1);
                sb.append((deq.pollLast())).append("\n");
            } else {
                index = al.get(deq.getFirst() - 1);
                sb.append((deq.pollFirst())).append("\n");
            }
        }
        System.out.println(sb);
    }
}