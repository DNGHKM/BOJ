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
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = n - 1;
        int ansL = 0;
        int ansR = 0;
        while (left<right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                ansL = arr[left];
                ansR = arr[right];
            }
            if (sum > 0) {
                right--;
            } else if (sum < 0) {
                left++;
            }else{
                break;
            }
        }
        System.out.println(ansL + " " + ansR);
    }
}
