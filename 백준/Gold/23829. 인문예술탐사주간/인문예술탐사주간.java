import java.io.*;
import java.util.*;

public class Main {
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            long ans = calculateDistanceSum(num);
            bw.write(ans + "\n");
        }
        bw.flush();
    }

    private static long calculateDistanceSum(int num) {
        int n = arr.length;

        if (num <= arr[0]) {
            long firstDist = 0;
            for (int i = 0; i < arr.length; i++) {
                firstDist += Math.abs(arr[i] - arr[0]);
            }
            return firstDist + (arr[0]-num) * arr.length;
        }

        if (num >= arr[n - 1]) {
            long lastDist = 0;
            for (int i = 0; i < arr.length; i++) {
                lastDist += Math.abs(arr[i] - arr[arr.length - 1]);
            }
            return lastDist + (num - arr[arr.length - 1]) * arr.length;
        }

        int idx = Arrays.binarySearch(arr, num);
        if (idx < 0) {
            idx = -idx - 1;
        }

        long leftSum = 0;
        long rightSum = 0;

        for (int i = 0; i < idx; i++) {
            leftSum += num - arr[i];
        }
        for (int i = idx; i < n; i++) {
            rightSum += arr[i] - num;
        }

        return leftSum + rightSum;
    }
}