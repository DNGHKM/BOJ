import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (n == 1) {
            System.out.print(arr[1]);
            return;
        } else {
            for (int i = 2; i < arr.length; i++) {
                int max = 0;
                for (int j = 1; j <= i / 2; j++) {
                    int sum = arr[i - j] + arr[j];
                    if (sum > max) {
                        max = sum;
                    }
                    arr[i] = Math.max(max, arr[i]);
                }
            }
        }
        System.out.print(arr[n]);
    }
}