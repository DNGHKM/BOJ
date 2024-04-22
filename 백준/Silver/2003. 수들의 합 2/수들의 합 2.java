import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int left = 0;
        int right = 0;
        long sum = arr[left];
        int count = 0;
        while (true) {
            if (sum >= s) {
                if (sum == s) count++;
                sum -= arr[left];
                left++;
            } else {
                right++;
                if (right == arr.length) break;
                sum += arr[right];
            }
        }
        System.out.println(count);
    }
}