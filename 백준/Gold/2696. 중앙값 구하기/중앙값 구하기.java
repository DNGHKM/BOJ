import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> min = new PriorityQueue<>();

            int num = n / 2;
            if (n % 2 == 1) num++;
            bw.write(num + "\n");
            ArrayList<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (list.size() < n) {
                if (st.hasMoreTokens()) {
                    list.add(Integer.parseInt(st.nextToken()));
                } else {
                    st = new StringTokenizer(br.readLine());
                }
            }
            for (int j = 0; j < n; j++) {
                int input = list.get(j);
                if (max.size() > min.size()) {
                    min.add(input);
                } else {
                    max.add(input);
                }
                if (min.isEmpty()) {
                    bw.write(max.peek() + " ");
                    continue;
                }
                if (max.peek() > min.peek()) {
                    max.add(min.poll());
                    min.add(max.poll());
                }
                if (j % 2 == 0) {
                    if (n >= 20 && j % 20 == 0) {
                        bw.write("\n");
                    }
                    bw.write(max.peek() + " ");
                }

            }
            bw.write("\n");
        }
        bw.flush();
    }
}