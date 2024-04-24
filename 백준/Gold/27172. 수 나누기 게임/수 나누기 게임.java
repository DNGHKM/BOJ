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
        int num = Arrays.stream(arr).max().getAsInt() + 1;
        int[] point = new int[num];
        boolean[] exist = new boolean[num];
        Arrays.stream(arr).forEach(i -> exist[i] = true);
        for (int k : arr) {
            for (int i = k + k; i < num; i += k) {
                if (exist[i]) {
                    point[i]--;
                    point[k]++;
                }
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(point[i] + " "));
    }
}