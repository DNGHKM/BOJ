import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int left = Integer.parseInt(st.nextToken());
        int right = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        if (left > n || right > n || left + right - 1 > n) {
            System.out.println(-1);
            return;
        }
        Arrays.fill(arr, 1);
        if (left >= right) {
            int maxIndex = n - right;
            arr[maxIndex] = left;
            for (int i = maxIndex - 1; i >= 0; i--) {
                arr[i] = Math.max(arr[i + 1] - 1, 1);
            }
            int num = 1;
            for (int i = arr.length - 1; i > maxIndex; i--) {
                arr[i] = num++;
            }
        } else {
            int maxIndex = left == 1 ? 0 : n - right;
            arr[maxIndex] = right;
            int num = 1;
            for (int i = arr.length - 1; i >= arr.length - right + 1; i--) {
                arr[i] = num++;
            }
            num = 1;
            for (int i = maxIndex - left + 1; i < maxIndex; i++) {
                arr[i] = num++;
            }
        }
        for (int i : arr) {
            bw.write(i + " ");
        }
        bw.flush();
    }
}