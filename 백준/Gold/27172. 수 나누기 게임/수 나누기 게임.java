import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (num < arr[i]) num = arr[i];
        }
        num++;
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
        for (int i : arr) {
            bw.write(point[i] + " ");
        }
        bw.flush();
    }
}