import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        if (arr[n - 1] - arr[0] == n-1) {
            System.out.println(-1);
            return;
        }
        int maxDiff = -1;
        int ans = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int num = (arr[i] + arr[i + 1]) / 2;
            int diff = Math.min(num - arr[i], arr[i + 1] - num);
            if (diff > maxDiff) {
                maxDiff = diff;
                ans = num;
            }
        }
        System.out.println(ans);
    }
}