import java.io.*;
import java.util.*;


class Main {
    static int max = 0;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        find(1, 0, arr[0]);
        System.out.println(max);
    }

    private static void find(int len, int idx, int sum) {
        if (idx == arr.length - 1) {
            max = Math.max(max, len);
            return;
        }
        idx++;
        if (sum >= arr[idx]) {
            find(len + 1, idx, sum + arr[idx]);
        } else {
            find(1, idx, arr[idx]);
            while (sum < arr[idx]) {
                idx++;
                if (idx > arr.length - 1) {
                    max = Math.max(max, len);
                    return;
                }
            }
            find(len + 1, idx, sum + arr[idx]);
        }
    }
}