import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long area = 0;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
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
        System.out.println(area);
    }
}