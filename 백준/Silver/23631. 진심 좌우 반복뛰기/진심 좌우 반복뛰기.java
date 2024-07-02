import java.io.*;
import java.util.Scanner;
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
            if (n == 1) {
                bw.write("0 R\n");
                continue;
            }
            int num = 0;
            while (true) {
                num++;
                if (distSum(num, k) > n - 1) {
                    num--;
                    break;
                }
            }
            int pos = (num + 1) / 2 * k;
            if (num % 2 == 0) {
                pos = -pos;
            }
            int toGo = (n - 1) - distSum(num, k);
            if (pos <= 0) {
                pos += toGo;
            } else {
                pos -= toGo;
            }
            bw.write(pos+"");
            if (num % 2 == 0) {
                bw.write(" R\n");
            } else {
                bw.write(" L\n");
            }
        }
        bw.flush();
    }

    private static int distSum(int times, int k) {
        return times * k * (times + 1) / 2;
    }
}