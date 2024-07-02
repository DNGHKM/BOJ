import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); //총 거리
            int k = Integer.parseInt(st.nextToken()); //첫 거리
            int left = 0;
            int right = 10000;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long num = distSum(mid, k);
                if (num < n - 1) {
                    left = mid + 1;
                } else if (num > n - 1) {
                    right = mid - 1;
                } else {
                    right = mid;
                    break;
                }
            }
            int pos = (right + 1) / 2 * k;
            if (right % 2 == 0) {
                pos = -pos;
            }
            int toGo = (int) ((n - 1) - distSum(right, k));
            if (pos <= 0) {
                pos += toGo;
            } else {
                pos -= toGo;
            }
            bw.write(pos+"");
            if (right % 2 == 0) {
                bw.write(" R\n");
            } else {
                bw.write(" L\n");
            }
        }
        bw.flush();
    }

    private static long distSum(int times, int k) {
        return (long) times * k * (times + 1) / 2;
    }
}