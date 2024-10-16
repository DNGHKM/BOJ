import java.io.*;
import java.util.*;

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
        for (int i = 0; i < n; i++) {
            boolean findEven = false;
            boolean findOdd = false;
            for (int j = i + 1; j < n; j++) {
                int sub = Math.abs(arr[j] - arr[i]);
                if (sub % 2 == 0) {
                    minEven = Math.min(minEven, sub);
                    findEven = true;
                } else {
                    minOdd = Math.min(minOdd, sub);
                    findOdd = true;
                }
                if (findOdd && findEven) {
                    break;
                }
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