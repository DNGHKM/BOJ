import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int left = i;
            int right = arr.length;
            int mid;
            while (left + 1 < right) {
                mid = (left + right) / 2;
                int sum = arr[i] + arr[mid];
                if (Math.abs(sum) < min) {
                    min = Math.abs(sum);
                    ans[0] = arr[i];
                    ans[1] = arr[mid];
                    if (sum == 0) {
                        Arrays.sort(ans);
                        System.out.println(ans[0] + " " + ans[1]);
                        return;
                    }
                }
                if (sum > 0) {
                    right = mid;
                } else if (sum < 0) {
                    left = mid;
                }
            }
        }
        Arrays.sort(ans);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
