import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[] arr = new int[3];
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 3; j++) {
                sum += arr[j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[j]);
            }
            if (sum >= k && min >= l) {
                cnt++;
                Arrays.stream(arr).forEach(list::add);
            }
        }
        bw.write(cnt + "\n");
        for (Integer i : list) {
            bw.write(i + " ");
        }
        bw.flush();
    }
}