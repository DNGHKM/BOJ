import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == i + 1) {
                cnt++;
                arr[i] = i == n - 1 ? 1 : arr[i] + 1;
            }
        }
        System.out.println(cnt);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}