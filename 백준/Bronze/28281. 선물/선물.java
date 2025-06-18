import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long sum = arr[0] + arr[1];
        long min = sum;

        for (int i = 0; i < arr.length - 2; i++) {
            sum -= arr[i];
            sum += arr[i + 2];
            min = Math.min(sum, min);
        }
        System.out.println(x * min);
    }
}

