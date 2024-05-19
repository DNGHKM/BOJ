import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            long area = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Stack<long[]> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                int height = arr[i];
                int start = i;
                while (!stack.isEmpty() && stack.peek()[1] > height) {
                    long[] pop = stack.pop();
                    long h = pop[1];
                    long w = i - pop[0];
                    area = Math.max(area, h * w);
                    start = (int) pop[0];
                }
                stack.push(new long[]{start, height});
            }
            while (!stack.isEmpty()) {
                long[] pop = stack.pop();
                long h = pop[1];
                long w = n - pop[0];
                area = Math.max(area, h * w);
            }
            bw.write(area + "\n");
        }
        bw.flush();
    }
}
