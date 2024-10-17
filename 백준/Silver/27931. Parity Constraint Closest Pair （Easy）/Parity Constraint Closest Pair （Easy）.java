import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int minEven = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;
        int oddIdx = -1;
        int evenIdx = -1;
        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            boolean isEven = cur % 2 == 0;
            if (oddIdx != -1) {
                int dist = Math.abs(cur - arr[oddIdx]);
                if (isEven) {
                    minOdd = Math.min(minOdd, dist);
                } else {
                    minEven = Math.min(minEven, dist);
                }
            }

            if (evenIdx != -1) {
                int dist = Math.abs(cur - arr[evenIdx]);
                if (isEven) {
                    minEven = Math.min(minEven, dist);
                } else {
                    minOdd = Math.min(minOdd, dist);
                }
            }
            if (cur % 2 == 0) {
                evenIdx = i;
            } else {
                oddIdx = i;
            }
        }
        if (minEven == Integer.MAX_VALUE) {
            minEven = -1;
        }
        if (minOdd == Integer.MAX_VALUE) {
            minOdd = -1;
        }
        System.out.println(minEven + " " + minOdd);
    }
}