import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            sb.append("Case #" + (i + 1) + ": ");
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n * 2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > 0) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[k] == arr[j] / 3 * 4) {
                            sb.append(arr[j] + " ");
                            arr[k] = -1;
                            break;
                        }
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}