import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] point = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            point[i] = Integer.parseInt(st.nextToken());
        }
        int[] sum = new int[100_001];
        Arrays.fill(sum, -1);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(sum[num] == -1) {
                sum[num] = 0;
            }
            for (int j = 0; j < n; j++) {
                char c = st.nextToken().charAt(0);
                if (c == 'O') {
                    sum[num]+=point[j];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int maxNum = -1;
        for (int i = 0; i < sum.length; i++) {
            if(sum[i] > max) {
                max = sum[i];
                maxNum = i;
            }
        }
        System.out.println((maxNum) + " " + max);
    }
}