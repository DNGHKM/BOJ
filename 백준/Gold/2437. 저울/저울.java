import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int ans = 1;
        while(true) {
            int tmp = ans;
            for (int i = arr.length-1; i >=0; i--) {
                if (arr[i] <= tmp) {
                    tmp -= arr[i];
                }
            }
            if (tmp == 0) {
                ans++;
            } else {
                System.out.println(ans);
                return;
            }
        }
    }
}
