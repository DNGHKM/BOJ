import java.io.*;
import java.util.*;

public class Main {
    static long total = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            int[] sumArr = new int[k + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 1; j < k + 1; j++) {
                sum += Integer.parseInt(st.nextToken());
                sumArr[j] = sum;
            }
            int[] find = findMax(sumArr);
            sb.append(find[0] + " " + find[1] + "\n");
        }
        System.out.println(total + "\n" + sb);
    }

    private static int[] findMax(int[] sumArr) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = sumArr.length;
        for (int i = 0; i < sumArr.length; i++) {
            for (int j = i + 1; j < sumArr.length; j++) {
                int cal = sumArr[j] - sumArr[i];

                if (max < cal) {
                    max = cal;
                    left = i + 1;
                    right = j;
                }

                if (max == cal) {
                    if (right - left + 1 > j - i) {
                        left = i + 1;
                        right = j;
                    }
                }
            }
        }
        total += max;
        return new int[]{left, right};
    }
}