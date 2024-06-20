import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int ans = -1;
        int left = 1; //최소거리
        int right = arr[arr.length - 1] - arr[0]; //최대거리

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPosition(mid, arr, m)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean canPosition(int dist, int[] buckets, int m) {
        int count = 1;
        int curPos = buckets[0];
        for (int j = 1; j < buckets.length; j++) {
            if (buckets[j] - curPos >= dist) {
                count++;
                if (count == m) {
                    return true;
                }
                curPos = buckets[j];
            }
        }
        return false;
    }
}