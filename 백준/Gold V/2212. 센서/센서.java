import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int length = arr[arr.length-1]-arr[0];
        int blank = 0;
        Integer[] gap = new Integer[n-1];
        for (int i = 1; i <arr.length; i++) {
            gap[i-1] = arr[i]-arr[i-1];
        }
        Arrays.sort(gap, Collections.reverseOrder());
        if(n>=k) {
            for (int i = 0; i < k - 1; i++) {
                blank += gap[i];
            }
        }else{
            for (Integer i : gap) {
                blank += i;
            }
        }
        int ans = length-blank;
        System.out.println(ans);
    }
}