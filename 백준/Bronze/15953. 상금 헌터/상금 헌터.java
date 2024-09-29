import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arrA = {500, 300, 200, 50, 30, 10};
        int[] arrB = {512, 256, 128, 64, 32};
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int aRank = 1;
            int num = 1;
            int d = 2;
            int bRank = 1;
            while (a > num) {
                aRank++;
                num += d;
                d++;
            }
            while (b > Math.pow(2, bRank) - 1) {
                bRank++;
            }
            int aMoney = aRank > arrA.length || a == 0 ? 0 : arrA[aRank - 1];
            int bMoney = bRank > arrB.length || b == 0 ? 0 : arrB[bRank - 1];
            bw.write((aMoney + bMoney) * 10000 + "\n");
        }
        bw.flush();
    }
}