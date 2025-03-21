import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[12];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            for (int j = 0; j < 12; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            sb.append((i + 1) + " " + solution(arr) + "\n");
        }
        System.out.println(sb);
    }

    private static int solution(int[] arr) {
        int cnt = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= arr.length - i - 1; j++) {
                int min = findMin(arr, i, j);
                if (min > arr[j - 1] && min > arr[j + i]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    private static int findMin(int[] arr, int size, int start) {
        int min = Integer.MAX_VALUE;
        for (int i = start; i < start + size; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}