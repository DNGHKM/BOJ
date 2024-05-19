import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (max.size() > min.size()) {
                min.add(input);
            } else {
                max.add(input);
            }
            if(min.isEmpty()) {
                bw.write(max.peek()+"\n");
                continue;
            }
            if (max.peek() > min.peek()) {
                max.add(min.poll());
                min.add(max.poll());
            }
            bw.write(max.peek()+"\n");
        }
        bw.flush();
    }
}