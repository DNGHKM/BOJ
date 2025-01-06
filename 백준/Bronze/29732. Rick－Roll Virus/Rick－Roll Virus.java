import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String status = br.readLine();
        char[] arr = new char[status.length()];
        for (int i = 0; i < status.length(); i++) {
            arr[i] = status.charAt(i);
        }
        char[] arr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'R') {
                int start = Math.max(0, i - k);
                int end = Math.min(n - 1, i + k);
                for (int j = start; j <= end; j++) {
                    arr2[j] = 'R';
                }
            }
        }
        int cnt = 0;
        for (char c : arr2) {
            if (c == 'R') {
                cnt++;
            }
        }
        if (cnt > m) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}