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
        if (Arrays.stream(arr).max().getAsInt() >= s) {
            System.out.print(1);
            return;
        }
        int left = 0;
        int right = 0;
        long sum = arr[left];
        int min = arr.length;
        boolean flag = false;
        while (left <= right) {
            if (sum >= s) {
                flag = true;
                if (right - left + 1 < min) {
                    min = right - left + 1;
                }
                sum -= arr[left];
                left++;
            } else {
                right++;
                if (right == arr.length) break;
                sum += arr[right];
            }
        }
        if (!flag) {
            System.out.println(0);
            return;
        }
        System.out.println(min);
    }
}
