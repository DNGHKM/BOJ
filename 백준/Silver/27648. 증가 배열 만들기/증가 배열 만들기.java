import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a + b - 1 > c) {
            System.out.println("NO");
            return;
        }
        bw.write("YES\n");
        int[][] ans = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ans[i][j] = i + j + 1;
            }
        }
        for (int[] an : ans) {
            for (int i : an) {
                bw.write(i + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}