import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long area = 0;
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        long[] leftIdx = new long[n];
        long[] rightIdx = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<long[]> stack = new Stack<>();
        stack.add(new long[]{arr[0], 0}); //값, 인덱스 순
        for (int i = 1; i < arr.length; i++) {
            leftIdx[i] = i;
            long num = i;
            while (!stack.isEmpty() && arr[i] <= stack.peek()[0]) {
                num = stack.pop()[1];
            }
            leftIdx[i] = num;
            stack.push(new long[]{arr[i], num});
        }
        stack.clear();
        stack.add(new long[]{arr[arr.length - 1], arr.length - 1}); //값, 인덱스 순
        for (int i = arr.length - 1; i >= 0; i--) {
            rightIdx[i] = i;
            long num = i;
            while (!stack.isEmpty() && arr[i] <= stack.peek()[0]) {
                num = stack.pop()[1];
            }
            rightIdx[i] = num;
            stack.push(new long[]{arr[i], num});
        }
        for (int i = 0; i < arr.length; i++) {
            area = Math.max(area, arr[i] * (rightIdx[i] - leftIdx[i] + 1));
        }
        System.out.println(area);
    }
}