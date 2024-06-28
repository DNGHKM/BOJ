import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n * k];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                arr[i * k + j] = Integer.parseInt(st.nextToken());
            }
        }
        int idx = 0;
        for (int i = 0; i < n * k - 1; i++) {
            int num = arr[idx];
            arr[idx] = 0;
            for (int j = 0; j < num; j++) {
                idx++;
                if (idx == arr.length) idx = 0;
                while (arr[idx] == 0) {
                    idx++;
                    if (idx == arr.length) idx = 0;
                }
            }
        }
        int lastIdx = -1;
        int lastNum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                lastNum = arr[i];
                lastIdx = i;
            }
        }
        System.out.println((lastIdx / k + 1) + " " + lastNum);
    }
}