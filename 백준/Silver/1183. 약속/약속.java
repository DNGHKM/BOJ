import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n % 2 != 0) {
            System.out.println(1);
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[n / 2] - arr[n / 2 - 1] + 1);
    }
}